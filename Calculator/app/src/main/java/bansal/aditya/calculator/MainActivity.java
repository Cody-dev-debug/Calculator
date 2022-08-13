package bansal.aditya.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import bansal.aditya.calculator.databinding.ActivityMainBinding;


/*
 *  Author: Aditya Bansal
 *  Last date modified: 09-08-2022
 *  (C), All rights reserved, Aditya Bansal 2022
 *
 *  App Icon -
 *  credits to Font Awesome and MDBootstrap for the application logo
 *  Link - https://mdbootstrap.com/tools/logo-generator-icons/
 * */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Testing";
    private static int MAX_CHARACTERS = 10;
    ActivityMainBinding binding;
    private Calculator mCalculator; // object of Calculator class
    private double number_one = 1; // first number
    private double number_two = 1; // second number
    private String operation_string; // current operation
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mCalculator = new Calculator();
        operation_string = operator.NULL.name();

//        Implementation of saved instance state
        if (savedInstanceState != null) {
            binding.inputValue1.setText(savedInstanceState.getString("First_number", ""));
            binding.inputValue2.setText(savedInstanceState.getString("Second_number", ""));
            binding.inputOperation.setText(savedInstanceState.getString("Operation", ""));
            binding.textViewResult.setText(savedInstanceState.getString("Final_result", ""));
            binding.completeOperation.setText(savedInstanceState.getString("Complete_operation", ""));
            operation_string = savedInstanceState.getString("Operation_string", operator.NULL.name());
            number_one = savedInstanceState.getDouble("Number_one", 0);
            number_two = savedInstanceState.getDouble("Number_two", 0);
        }
        binding.buttonOne.setOnClickListener(new NumClick());
        binding.buttonTwo.setOnClickListener(new NumClick());
        binding.buttonThree.setOnClickListener(new NumClick());
        binding.buttonFour.setOnClickListener(new NumClick());
        binding.buttonFive.setOnClickListener(new NumClick());
        binding.buttonSix.setOnClickListener(new NumClick());
        binding.buttonSeven.setOnClickListener(new NumClick());
        binding.buttonEight.setOnClickListener(new NumClick());
        binding.buttonNine.setOnClickListener(new NumClick());
        binding.buttonDot.setOnClickListener(new NumClick());
        binding.buttonZero.setOnClickListener(new NumClick());
        binding.buttonPlus.setOnClickListener(new OperatorClick());
        binding.buttonMinus.setOnClickListener(new OperatorClick());
        binding.buttonDivide.setOnClickListener(new OperatorClick());
        binding.buttonMultiply.setOnClickListener(new OperatorClick());
        binding.buttonMod.setOnClickListener(new OperatorClick());
        if (window.orientation==90 || ) {
            binding.buttonFactorial.setOnClickListener(new OperatorClick());
            binding.buttonSin.setOnClickListener(new OperatorClick());
            binding.buttonCos.setOnClickListener(new OperatorClick());
            binding.buttonTan.setOnClickListener(new OperatorClick());
        }

    }

    //    implementation of Saved instance state
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("First_number", binding.inputValue1.getText().toString());
        outState.putString("Operation", binding.inputOperation.getText().toString());
        outState.putString("Second_number", binding.inputValue2.getText().toString());
        outState.putString("Final_result", binding.textViewResult.getText().toString());
        outState.putString("Complete_operation", binding.completeOperation.getText().toString());
        outState.putString("Operation_string", operation_string);
        outState.putDouble("Number_one", number_one);
        outState.putDouble("Number_two", number_two);
    }

    //    method to check where to append the numbers (first or second number)
    private void selectTextViewToAppend(String number) {
        if (operation_string.equals(operator.NULL.name())) {
            if (binding.inputValue1.getText().toString().contains(".")) {
                MAX_CHARACTERS++;
            }
            if (binding.inputValue1.getText().length() < MAX_CHARACTERS) {
                binding.inputValue1.append(number);
                MAX_CHARACTERS = 10;
            } else {
                MAX_CHARACTERS = 10;
                Toast.makeText(this, "Cannot have more than 10 numbers", Toast.LENGTH_LONG).show();
            }
        } else {
            if (binding.inputValue1.getText().toString().contains(".")) {
                MAX_CHARACTERS++;
            }
            if (binding.inputValue2.getText().length() < MAX_CHARACTERS) {
                binding.inputValue2.append(number);
                MAX_CHARACTERS = 10;
            } else {
                MAX_CHARACTERS = 10;
                Toast.makeText(this, "Cannot have more than 10 numbers", Toast.LENGTH_LONG).show();
            }

        }
    }

    //            handle operations for operators
    public class OperatorClick extends MainActivity implements View.OnClickListener {

        @Override
        @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
        public void onClick(View view) {
            try {
                if (!binding.textViewResult.getText().toString().equals("")) {
                    onClearClick(view);
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            if (!binding.inputValue1.getText().toString().equals("")) {
                if (binding.inputOperation.getText().toString().equals("sin("))
                    binding.inputOperation1.setText("");
                switch (view.getId()) {
                    case R.id.button_plus:
                        operation_string = operator.ADD.name();
                        binding.inputOperation.setText("+");
                        flag = false;
                        break;
                    case R.id.button_minus:
                        operation_string = operator.SUB.name();
                        binding.inputOperation.setText("-");
                        flag = false;
                        break;
                    case R.id.button_multiply:
                        operation_string = operator.MUL.name();
                        binding.inputOperation.setText("x");
                        flag = false;
                        break;
                    case R.id.button_divide:
                        operation_string = operator.DIV.name();
                        binding.inputOperation.setText("/");
                        flag = false;
                        break;
                    case R.id.button_mod:
                        operation_string = operator.MOD.name();
                        binding.inputOperation.setText("%");
                        flag = false;
                        break;
                    case R.id.button_pow:
                        operation_string = operator.POW.name();
                        binding.inputOperation.setText("^");
                        flag = false;
                        break;
                    case R.id.button_factorial:
                        operation_string = operator.FACT.name();
                        binding.inputOperation.setText("!");
                        flag = true;
                        break;
                    default:
                        operation_string = operator.NULL.name();
                        break;
                }
                return;
            }
            switch (view.getId()) {
                case R.id.button_root:
                    operation_string = operator.ROOT.name();
                    binding.inputOperation.setText("√(");
                    binding.inputOperation1.setText(")");
                    Log.d(TAG, "In Root ");
                    flag = true;
                    break;
                case R.id.button_sin:
                    operation_string = operator.SIN.name();
                    binding.inputOperation.setText("sin(");
                    binding.inputOperation1.setText(")");
                    Log.d(TAG, "In SIN " + operation_string);
                    flag = true;
                    break;
                case R.id.button_cos:
                    operation_string = operator.COS.name();
                    binding.inputOperation.setText("cos(");
                    binding.inputOperation1.setText(")");
                    flag = true;
                    break;
                case R.id.button_tan:
                    operation_string = operator.TAN.name();
                    binding.inputOperation.setText("tan(");
                    binding.inputOperation1.setText(")");
                    flag = true;
                    break;
                default:
                    Toast.makeText(this, "Enter first number before a binary operation", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

    public void onEqualsClick(View view) {
        number_one = 1; // first number
        number_two = 1;
//        handle equals click
        if ((binding.inputValue1.getText().toString().equals("") && !flag) || binding.inputOperation.getText().toString().equals("") || (binding.inputValue2.getText().toString().equals("") && !binding.inputOperation.getText().toString().equals("!"))) {
            Toast.makeText(this, "Enter the numbers and the operation", Toast.LENGTH_LONG).show();
        } else {
            if (!binding.inputValue1.getText().toString().equals(""))
                number_one = Double.parseDouble(binding.inputValue1.getText().toString());
            if (!binding.inputValue2.getText().toString().equals(""))
                number_two = Double.parseDouble(binding.inputValue2.getText().toString());
            String operation;
            switch (operator.valueOf(operation_string)) {
                case ADD:
                    binding.textViewResult.setText(String.valueOf(mCalculator.addition(number_one, number_two)));
                    operation = binding.inputValue1.getText().toString() + getString(R.string.button_plus) + binding.inputValue2.getText().toString();
                    break;
                case SUB:
                    binding.textViewResult.setText(String.valueOf(mCalculator.subtraction(number_one, number_two)));
                    operation = binding.inputValue1.getText().toString() + getString(R.string.button_minus) + binding.inputValue2.getText().toString();
                    break;
                case MUL:
                    binding.textViewResult.setText(String.valueOf(mCalculator.multiplication(number_one, number_two)));
                    operation = binding.inputValue1.getText().toString() + getString(R.string.button_mul) + binding.inputValue2.getText().toString();
                    break;
                case DIV:
                    try {
                        binding.textViewResult.setText(String.valueOf(mCalculator.division(number_one, number_two)));
                        operation = binding.inputValue1.getText().toString() + getString(R.string.button_div) + binding.inputValue2.getText().toString();
                    } catch (IllegalArgumentException e) {
                        Toast.makeText(this, getString(R.string.error), Toast.LENGTH_LONG).show();
                        operation = "";
                        clearAll();
                    }
                    break;
                case MOD:
                    binding.textViewResult.setText(String.valueOf(mCalculator.modulus(number_one, number_two)));
                    operation = binding.inputValue1.getText().toString() + getString(R.string.button_mod) + binding.inputValue2.getText().toString();
                    break;
                case ROOT:
                    binding.textViewResult.setText(String.valueOf(mCalculator.squareRoot(number_one, number_two)));
                    operation = binding.inputValue1.getText().toString() + getString(R.string.button_root) + binding.inputValue2.getText().toString();
                    break;
                case POW:
                    binding.textViewResult.setText(String.valueOf(mCalculator.power(number_one, number_two)));
                    operation = binding.inputValue1.getText().toString() + getString(R.string.button_pow) + binding.inputValue2.getText().toString();
                    break;
                case FACT:
                    if (number_one > 19) {
                        Toast.makeText(this, "Number too large to calculate", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        binding.textViewResult.setText(String.valueOf(mCalculator.factorial((int) number_one)));
                        operation = binding.inputValue1.getText().toString() + getString(R.string.button_plus) + binding.inputValue2.getText().toString();
                    }
                    break;
                case SIN:
                    Log.d(TAG, "In SIN " + number_one + number_two);
                    binding.textViewResult.setText(String.valueOf(mCalculator.sin(number_one, number_two)));
                    operation = binding.inputValue1.getText().toString() + getString(R.string.button_sin) + "(" + binding.inputValue2.getText().toString() + binding.inputOperation1.getText().toString();
                    break;
                case COS:
                    binding.textViewResult.setText(String.valueOf(mCalculator.cos(number_one, number_two)));
                    operation = binding.inputValue1.getText().toString() + getString(R.string.button_cos) + "(" + binding.inputValue2.getText().toString() + binding.inputOperation1.getText().toString();
                    break;
                case TAN:
                    binding.textViewResult.setText(String.valueOf(mCalculator.tan(number_one, number_two)));
                    operation = binding.inputValue1.getText().toString() + getString(R.string.button_tan) + "(" + binding.inputValue2.getText().toString() + binding.inputOperation1.getText().toString();
                    break;
                case NULL:
                    binding.textViewResult.setText(getString(R.string.error));
                    operation = "";
                    break;
                default:
                    operation = "";
                    break;
            }
            binding.completeOperation.setText(operation);
            clearAll();
            Log.d(TAG, binding.completeOperation.getText().toString());
        }
    }
    //            handle operations for numbers
//
//    public void onNumClick(View view) {
//
//        }
//    }

    //    handle clear click
    public void onClearClick(View view) {
        clearAll();
        binding.textViewResult.setText("");
        binding.completeOperation.setText("");
    }

    //    clearing most values (needed many times, so created a method to reduce code duplication
    public void clearAll() {
        binding.inputValue1.setText("");
        binding.inputOperation.setText("");
        binding.inputValue2.setText("");
        binding.inputOperation1.setText("");
        flag = false;
        number_one = 0;
        number_two = 0;
        operation_string = operator.NULL.name();
    }

    //    handle backspace click (the ImageButton) in the layout
    public void onBackspaceClick(View view) {
        view.setOnLongClickListener(v -> {
            clearAll();
            return false;
        });
        if (!binding.inputValue2.getText().toString().equals("")) {
            backspaceImplementation(binding.inputValue2);
        } else {
            if (!binding.inputOperation.getText().toString().equals("")) {
                binding.inputOperation.setText("");
                binding.inputOperation1.setText("");
            } else {
                if (!binding.inputValue1.getText().toString().equals("")) {
                    backspaceImplementation(binding.inputValue1);
                }
            }
        }
    }

    private void backspaceImplementation(@NonNull TextView view) {
        String backspace = view.getText().toString();
        backspace = backspace.substring(0, backspace.length() - 1);
        view.setText(backspace);
    }

    private enum operator {
        ADD, SUB, MUL, DIV, MOD, ROOT, POW, FACT, SIN, COS, TAN, NULL
    }

    @SuppressLint("NonConstantResourceId")
    public class NumClick extends MainActivity implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            try {
                if (!binding.textViewResult.getText().toString().equals("")) {
                    onClearClick(view);
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            switch (view.getId()) {
                case R.id.button_one:
                    selectTextViewToAppend("1");
                    break;
                case R.id.button_two:
                    selectTextViewToAppend("2");
                    break;
                case R.id.button_three:
                    selectTextViewToAppend("3");
                    break;
                case R.id.button_four:
                    selectTextViewToAppend("4");
                    break;
                case R.id.button_five:
                    selectTextViewToAppend("5");
                    break;
                case R.id.button_six:
                    selectTextViewToAppend("6");
                    break;
                case R.id.button_seven:
                    selectTextViewToAppend("7");
                    break;
                case R.id.button_eight:
                    selectTextViewToAppend("8");
                    break;
                case R.id.button_nine:
                    selectTextViewToAppend("9");
                    break;
                case R.id.button_zero:
                    selectTextViewToAppend("0");
                    break;
                case R.id.button_dot:
                    if (operation_string.equals(operator.NULL.name())) {
                        if (binding.inputValue1.getText().toString().contains(".")) {
                            Toast.makeText(this, "Cannot have more than one decimal point in a number", Toast.LENGTH_LONG).show();
                        } else {
                            binding.inputValue1.append(".");
                        }
                    } else {
                        if (binding.inputValue2.getText().toString().contains(".")) {
                            Toast.makeText(this, "Cannot have more than one decimal point in a number", Toast.LENGTH_LONG).show();
                        } else {
                            binding.inputValue2.append(".");
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }

}
