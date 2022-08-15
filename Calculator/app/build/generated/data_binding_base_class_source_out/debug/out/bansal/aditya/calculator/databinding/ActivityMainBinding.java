// Generated by view binder compiler. Do not edit!
package bansal.aditya.calculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bansal.aditya.calculator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton buttonBackspace;

  @NonNull
  public final Button buttonClear;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final Button buttonCos;

  @NonNull
  public final Button buttonDivide;

  @NonNull
  public final Button buttonDot;

  @NonNull
  public final Button buttonEight;

  @NonNull
  public final Button buttonEquals;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final Button buttonFactorial;

  @NonNull
  public final Button buttonFive;

  @NonNull
  public final Button buttonFour;

  @NonNull
  public final Button buttonMinus;

  @NonNull
  public final Button buttonMod;

  @NonNull
  public final Button buttonMultiply;

  @NonNull
  public final Button buttonNine;

  @NonNull
  public final Button buttonOne;

  @NonNull
  public final Button buttonPlus;

  @NonNull
  public final Button buttonPow;

  @NonNull
  public final Button buttonRoot;

  @NonNull
  public final Button buttonSeven;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final Button buttonSin;

  @NonNull
  public final Button buttonSix;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final Button buttonTan;

  @NonNull
  public final Button buttonThree;

  @NonNull
  public final Button buttonTwo;

  @NonNull
  public final Button buttonZero;

  @NonNull
  public final TextView completeOperation;

  @NonNull
  public final TextView inputOperation;

  @NonNull
  public final TextView inputOperation1;

  @NonNull
  public final TextView inputValue1;

  @NonNull
  public final TextView inputValue2;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TextView textViewResult;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton buttonBackspace, @NonNull Button buttonClear, @Nullable Button buttonCos,
      @NonNull Button buttonDivide, @NonNull Button buttonDot, @NonNull Button buttonEight,
      @NonNull Button buttonEquals, @Nullable Button buttonFactorial, @NonNull Button buttonFive,
      @NonNull Button buttonFour, @NonNull Button buttonMinus, @NonNull Button buttonMod,
      @NonNull Button buttonMultiply, @NonNull Button buttonNine, @NonNull Button buttonOne,
      @NonNull Button buttonPlus, @NonNull Button buttonPow, @NonNull Button buttonRoot,
      @NonNull Button buttonSeven, @Nullable Button buttonSin, @NonNull Button buttonSix,
      @Nullable Button buttonTan, @NonNull Button buttonThree, @NonNull Button buttonTwo,
      @NonNull Button buttonZero, @NonNull TextView completeOperation,
      @NonNull TextView inputOperation, @NonNull TextView inputOperation1,
      @NonNull TextView inputValue1, @NonNull TextView inputValue2,
      @NonNull LinearLayout linearLayout, @NonNull TableLayout tableLayout,
      @NonNull TextView textViewResult) {
    this.rootView = rootView;
    this.buttonBackspace = buttonBackspace;
    this.buttonClear = buttonClear;
    this.buttonCos = buttonCos;
    this.buttonDivide = buttonDivide;
    this.buttonDot = buttonDot;
    this.buttonEight = buttonEight;
    this.buttonEquals = buttonEquals;
    this.buttonFactorial = buttonFactorial;
    this.buttonFive = buttonFive;
    this.buttonFour = buttonFour;
    this.buttonMinus = buttonMinus;
    this.buttonMod = buttonMod;
    this.buttonMultiply = buttonMultiply;
    this.buttonNine = buttonNine;
    this.buttonOne = buttonOne;
    this.buttonPlus = buttonPlus;
    this.buttonPow = buttonPow;
    this.buttonRoot = buttonRoot;
    this.buttonSeven = buttonSeven;
    this.buttonSin = buttonSin;
    this.buttonSix = buttonSix;
    this.buttonTan = buttonTan;
    this.buttonThree = buttonThree;
    this.buttonTwo = buttonTwo;
    this.buttonZero = buttonZero;
    this.completeOperation = completeOperation;
    this.inputOperation = inputOperation;
    this.inputOperation1 = inputOperation1;
    this.inputValue1 = inputValue1;
    this.inputValue2 = inputValue2;
    this.linearLayout = linearLayout;
    this.tableLayout = tableLayout;
    this.textViewResult = textViewResult;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_backspace;
      ImageButton buttonBackspace = ViewBindings.findChildViewById(rootView, id);
      if (buttonBackspace == null) {
        break missingId;
      }

      id = R.id.button_clear;
      Button buttonClear = ViewBindings.findChildViewById(rootView, id);
      if (buttonClear == null) {
        break missingId;
      }

      id = R.id.button_cos;
      Button buttonCos = ViewBindings.findChildViewById(rootView, id);

      id = R.id.button_divide;
      Button buttonDivide = ViewBindings.findChildViewById(rootView, id);
      if (buttonDivide == null) {
        break missingId;
      }

      id = R.id.button_dot;
      Button buttonDot = ViewBindings.findChildViewById(rootView, id);
      if (buttonDot == null) {
        break missingId;
      }

      id = R.id.button_eight;
      Button buttonEight = ViewBindings.findChildViewById(rootView, id);
      if (buttonEight == null) {
        break missingId;
      }

      id = R.id.button_equals;
      Button buttonEquals = ViewBindings.findChildViewById(rootView, id);
      if (buttonEquals == null) {
        break missingId;
      }

      id = R.id.button_factorial;
      Button buttonFactorial = ViewBindings.findChildViewById(rootView, id);

      id = R.id.button_five;
      Button buttonFive = ViewBindings.findChildViewById(rootView, id);
      if (buttonFive == null) {
        break missingId;
      }

      id = R.id.button_four;
      Button buttonFour = ViewBindings.findChildViewById(rootView, id);
      if (buttonFour == null) {
        break missingId;
      }

      id = R.id.button_minus;
      Button buttonMinus = ViewBindings.findChildViewById(rootView, id);
      if (buttonMinus == null) {
        break missingId;
      }

      id = R.id.button_mod;
      Button buttonMod = ViewBindings.findChildViewById(rootView, id);
      if (buttonMod == null) {
        break missingId;
      }

      id = R.id.button_multiply;
      Button buttonMultiply = ViewBindings.findChildViewById(rootView, id);
      if (buttonMultiply == null) {
        break missingId;
      }

      id = R.id.button_nine;
      Button buttonNine = ViewBindings.findChildViewById(rootView, id);
      if (buttonNine == null) {
        break missingId;
      }

      id = R.id.button_one;
      Button buttonOne = ViewBindings.findChildViewById(rootView, id);
      if (buttonOne == null) {
        break missingId;
      }

      id = R.id.button_plus;
      Button buttonPlus = ViewBindings.findChildViewById(rootView, id);
      if (buttonPlus == null) {
        break missingId;
      }

      id = R.id.button_pow;
      Button buttonPow = ViewBindings.findChildViewById(rootView, id);
      if (buttonPow == null) {
        break missingId;
      }

      id = R.id.button_root;
      Button buttonRoot = ViewBindings.findChildViewById(rootView, id);
      if (buttonRoot == null) {
        break missingId;
      }

      id = R.id.button_seven;
      Button buttonSeven = ViewBindings.findChildViewById(rootView, id);
      if (buttonSeven == null) {
        break missingId;
      }

      id = R.id.button_sin;
      Button buttonSin = ViewBindings.findChildViewById(rootView, id);

      id = R.id.button_six;
      Button buttonSix = ViewBindings.findChildViewById(rootView, id);
      if (buttonSix == null) {
        break missingId;
      }

      id = R.id.button_tan;
      Button buttonTan = ViewBindings.findChildViewById(rootView, id);

      id = R.id.button_three;
      Button buttonThree = ViewBindings.findChildViewById(rootView, id);
      if (buttonThree == null) {
        break missingId;
      }

      id = R.id.button_two;
      Button buttonTwo = ViewBindings.findChildViewById(rootView, id);
      if (buttonTwo == null) {
        break missingId;
      }

      id = R.id.button_zero;
      Button buttonZero = ViewBindings.findChildViewById(rootView, id);
      if (buttonZero == null) {
        break missingId;
      }

      id = R.id.complete_operation;
      TextView completeOperation = ViewBindings.findChildViewById(rootView, id);
      if (completeOperation == null) {
        break missingId;
      }

      id = R.id.input_operation;
      TextView inputOperation = ViewBindings.findChildViewById(rootView, id);
      if (inputOperation == null) {
        break missingId;
      }

      id = R.id.input_operation1;
      TextView inputOperation1 = ViewBindings.findChildViewById(rootView, id);
      if (inputOperation1 == null) {
        break missingId;
      }

      id = R.id.input_value_1;
      TextView inputValue1 = ViewBindings.findChildViewById(rootView, id);
      if (inputValue1 == null) {
        break missingId;
      }

      id = R.id.input_value_2;
      TextView inputValue2 = ViewBindings.findChildViewById(rootView, id);
      if (inputValue2 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.tableLayout;
      TableLayout tableLayout = ViewBindings.findChildViewById(rootView, id);
      if (tableLayout == null) {
        break missingId;
      }

      id = R.id.textView_result;
      TextView textViewResult = ViewBindings.findChildViewById(rootView, id);
      if (textViewResult == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, buttonBackspace, buttonClear,
          buttonCos, buttonDivide, buttonDot, buttonEight, buttonEquals, buttonFactorial,
          buttonFive, buttonFour, buttonMinus, buttonMod, buttonMultiply, buttonNine, buttonOne,
          buttonPlus, buttonPow, buttonRoot, buttonSeven, buttonSin, buttonSix, buttonTan,
          buttonThree, buttonTwo, buttonZero, completeOperation, inputOperation, inputOperation1,
          inputValue1, inputValue2, linearLayout, tableLayout, textViewResult);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
