package com.carbit3333333.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String numberX = "";
    private float numberXFloat = 0;
    private float numberYFloat = 0;
    private float result = 0;

    private String numberDel = "";
    private TextView txtNumber;
    private boolean isSelected = true;
    private boolean continueResult;
    private int triger = 0;
    private int x = 0;
    private int y = 0;

    private Button bntDeleteAll;
    private Button btnDeleteOne;
    private Button btnDeleteCharacter;
    private Button btnDivide;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnEquels;
    private Button point;
    private Button btnX;
    private Button bnt1;
    private Button bnt2;
    private Button bnt3;
    private Button bnt4;
    private Button bnt5;
    private Button bnt6;
    private Button bnt7;
    private Button bnt8;
    private Button bnt9;
    private Button bnt0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber = findViewById(R.id.txtNumber);
        bntDeleteAll = findViewById(R.id.bntDeleteAll);
        btnDeleteCharacter = findViewById(R.id.btnDeleteCharacter);
        btnDeleteOne = findViewById(R.id.btnDeleteOne);
        btnDivide = findViewById(R.id.btnDivide);
        btnMinus = findViewById(R.id.btnMinus);
        btnEquels = findViewById(R.id.btnEquels);
        btnPlus = findViewById(R.id.btnPlus);
        btnX = findViewById(R.id.btnX);
        bnt0 = findViewById(R.id.btn0);
        bnt1 = findViewById(R.id.bnt1);
        bnt2 = findViewById(R.id.btn2);
        bnt3 = findViewById(R.id.bnt3);
        bnt4 = findViewById(R.id.btn4);
        bnt5 = findViewById(R.id.btn5);
        bnt6 = findViewById(R.id.btn6);
        bnt7 = findViewById(R.id.btn7);
        bnt8 = findViewById(R.id.btn8);
        bnt9 = findViewById(R.id.btn9);
        point = findViewById(R.id.buttonPoint);
        addListener();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bntDeleteAll:
                numberX = "";
                txtNumber.setText(numberX);
                continueResult = false;

                break;
            case R.id.btnDeleteCharacter:
                if (!numberX.isEmpty()) {

                numberX = numberX.substring(0, numberX.length() - 1);
            }
            if (isSelected && !numberX.isEmpty()) {
                numberXFloat = Float.parseFloat(numberX);
            } else if (!isSelected && !numberX.isEmpty()) {
                numberYFloat = Float.parseFloat(numberX);
            }
            txtNumber.setText(numberX);
            System.out.println("нажатие прошло");

            break;
            case R.id.btnDeleteOne:

                break;
            case R.id.btnDivide:
                triger = 1;
                if (isSelected && !continueResult) {
                    numberXFloat = Float.parseFloat(numberX);
                }else if(continueResult){
                    numberXFloat = Float.parseFloat(numberDel);
                                   }
                isSelected = false;
                numberX = "";
                break;
            case R.id.btnMinus:
                triger = 3;
                if (isSelected ) {
                    numberXFloat = Float.parseFloat(numberX);
                }
                isSelected = false;
                numberX = "";
                break;
            case R.id.btnX:
                triger = 2;
                if (isSelected) {
                    numberXFloat = Float.parseFloat(numberX);
                }
                isSelected = false;
                numberX = "";
                break;
            case R.id.btnPlus:
                triger = 4;
                if (isSelected) {
                    numberXFloat = Float.parseFloat(numberX);
                }
                isSelected = false;
                numberX = "";
                break;


            case R.id.bnt1:
                if (isSelected) {
                    x = 1;
                    numberX += "" + x;
                } else {
                    y = 1;
                    numberX += "" + y;
                }

                txtNumber.setText(numberX);


                break;
            case R.id.btn2:
                if (isSelected) {
                    x = 2;
                    numberX += "" + x;
                } else {
                    y = 2;
                    numberX += "" + y;
                }
                txtNumber.setText(numberX);

                break;
            case R.id.bnt3:
                if (isSelected) {
                    x = 3;
                    numberX += "" + x;
                } else {
                    y = 3;
                    numberX += "" + y;
                }
                txtNumber.setText(numberX);
                break;
            case R.id.btn4:
                if (isSelected) {
                    x = 4;
                    numberX += "" + x;
                } else {
                    y = 4;
                    numberX += "" + y;
                }
                txtNumber.setText(numberX);

                break;
            case R.id.btn5:
                if (isSelected) {
                    x = 5;
                    numberX += "" + x;
                } else {
                    y = 5;
                    numberX += "" + y;
                }
                txtNumber.setText(numberX);

                break;
            case R.id.btn6:
                if (isSelected) {
                    x = 6;
                    numberX += "" + x;
                } else {
                    y = 6;
                    numberX += "" + y;
                }
                txtNumber.setText(numberX);

                break;
            case R.id.btn7:
                if (isSelected) {
                    x = 7;
                    numberX += "" + x;
                } else {
                    y = 7;
                    numberX += "" + y;
                }
                txtNumber.setText(numberX);

                break;
            case R.id.btn8:
                if (isSelected) {
                    x = 8;
                    numberX += "" + x;
                } else {
                    y = 8;
                    numberX += "" + y;
                }
                txtNumber.setText(numberX);

                break;
            case R.id.btn9:
                if (isSelected) {
                    x = 9;
                    numberX += "" + x;
                } else {
                    y = 9;
                    numberX += "" + y;
                }
                txtNumber.setText(numberX);

                break;
            case R.id.btn0:
                if (isSelected) {
                    x = 0;
                    numberX += "" + x;
                } else {
                    y = 0;
                    numberX += "" + y;
                }

                txtNumber.setText(numberX);

                break;
            case R.id.buttonPoint:
                if (isSelected) {

                    numberX += "" + ".";
                } else {
                    numberX += "" + ".";
                }

                txtNumber.setText(numberX);

                break;
            case R.id.btnEquels:
                numberYFloat = Float.parseFloat(numberX);
                result = result(triger, numberXFloat, numberYFloat);
                txtNumber.setText("" + result);
                numberDel = numberX;
                numberX = "";
                isSelected = true;
                continueResult = true;
                break;
        }
    }

    private float result(int trigger, float x, float y) {
        if (trigger == 1) {
            return x / y;
        } else if (trigger == 2) {
            return x * y;
        } else if (trigger == 3) {
            return x - y;
        } else if (trigger == 4) {
            return x + y;
        }
        return 0;
    }


    private void addListener() {
        btnDeleteCharacter.setOnClickListener(this);
        btnDeleteOne.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnEquels.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        bntDeleteAll.setOnClickListener(this);
        btnX.setOnClickListener(this);
        bnt1.setOnClickListener(this);
        bnt2.setOnClickListener(this);
        bnt3.setOnClickListener(this);
        bnt4.setOnClickListener(this);
        bnt5.setOnClickListener(this);
        bnt6.setOnClickListener(this);
        bnt7.setOnClickListener(this);
        bnt8.setOnClickListener(this);
        bnt9.setOnClickListener(this);
        bnt0.setOnClickListener(this);
        point.setOnClickListener(this);

    }

}

