package edu.vccs.hduong7592.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static int[][] Array1;
    public static int[][] Array2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Array1Btn = (Button) findViewById(R.id.Array1Btn);
        Button Array2Btn = (Button) findViewById(R.id.Array2Btn);
        Button CompareBtn = (Button) findViewById(R.id.CompareBtn);


        final EditText Val1Text = (EditText) findViewById(R.id.Val1);
        final EditText Val2Text = (EditText) findViewById(R.id.Val2);
        final EditText Val3Text = (EditText) findViewById(R.id.Val3);
        final EditText Val4Text = (EditText) findViewById(R.id.Val4);
        final EditText Val5Text = (EditText) findViewById(R.id.Val5);
        final EditText Val6Text = (EditText) findViewById(R.id.Val6);
        final EditText Val7Text = (EditText) findViewById(R.id.Val7);
        final EditText Val8Text = (EditText) findViewById(R.id.Val8);
        final EditText Val9Text = (EditText) findViewById(R.id.Val9);

        final TextView Array1LB = (TextView) findViewById(R.id.Array1LB);
        final TextView Array2LB = (TextView) findViewById(R.id.Array2LB);
        final TextView ResultLB = (TextView) findViewById(R.id.ResultLB);


        Array1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Val1 = Integer.parseInt(Val1Text.getText().toString());
                int Val2 = Integer.parseInt(Val2Text.getText().toString());
                int Val3 = Integer.parseInt(Val3Text.getText().toString());
                int Val4 = Integer.parseInt(Val4Text.getText().toString());
                int Val5 = Integer.parseInt(Val5Text.getText().toString());
                int Val6 = Integer.parseInt(Val6Text.getText().toString());
                int Val7 = Integer.parseInt(Val7Text.getText().toString());
                int Val8 = Integer.parseInt(Val8Text.getText().toString());
                int Val9 = Integer.parseInt(Val9Text.getText().toString());

                Array1 = CreateArray(Val1, Val2, Val3, Val4, Val5, Val6, Val7, Val8, Val9);
                Val1Text.setText("");
                Val2Text.setText("");
                Val3Text.setText("");
                Val4Text.setText("");
                Val5Text.setText("");
                Val6Text.setText("");
                Val7Text.setText("");
                Val8Text.setText("");
                Val9Text.setText("");

                Array1LB.setText(DisplayArray(Array1));
            }
        });

        Array2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Val1 = Integer.parseInt(Val1Text.getText().toString());
                int Val2 = Integer.parseInt(Val2Text.getText().toString());
                int Val3 = Integer.parseInt(Val3Text.getText().toString());
                int Val4 = Integer.parseInt(Val4Text.getText().toString());
                int Val5 = Integer.parseInt(Val5Text.getText().toString());
                int Val6 = Integer.parseInt(Val6Text.getText().toString());
                int Val7 = Integer.parseInt(Val7Text.getText().toString());
                int Val8 = Integer.parseInt(Val8Text.getText().toString());
                int Val9 = Integer.parseInt(Val9Text.getText().toString());

                Array2 = CreateArray(Val1, Val2, Val3, Val4, Val5, Val6, Val7, Val8, Val9);
                Val1Text.setText("");
                Val2Text.setText("");
                Val3Text.setText("");
                Val4Text.setText("");
                Val5Text.setText("");
                Val6Text.setText("");
                Val7Text.setText("");
                Val8Text.setText("");
                Val9Text.setText("");

                Array2LB.setText(DisplayArray(Array2));
            }
        });

        CompareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean IsEquals = CompareArray(Array1, Array2);
                if(IsEquals){
                    ResultLB.setText("Both arrays are strictly equal.");
                }
                else{
                    ResultLB.setText("Both arrays are not stictly equal.");
                }
            }
        });

    }

    private boolean CompareArray(int[][] array1, int[][] array2) {
        int Maxrow = 3;
        int Maxcol = 3;
        int Value = 0;
        for(int row=0; row<Maxrow; row++)
        {
            for(int col=0; col<Maxcol; col++){
                if(array1[row][col] == array2[row][col]){

                }
                else {
                    Value = -1;
                }
            }
        }
        if(Value < 0){
            return false;
        }
        else{
            return true;
        }
    }


    private int[][] CreateArray(int val1, int val2, int val3, int val4, int val5, int val6, int val7, int val8, int val9) {
        int newArray[][] = new int[3][3];

        newArray[0][0] = val1;
        newArray[0][1] = val2;
        newArray[0][2] = val3;
        newArray[1][0] = val4;
        newArray[1][1] = val5;
        newArray[1][2] = val6;
        newArray[2][0] = val7;
        newArray[2][1] = val8;
        newArray[2][2] = val9;

        return newArray;
    }

    public static String DisplayArray(int[][] array) {
        String Value = "";
        for(int row=0; row<array.length; row++)
        {
            for(int col=0; col<array[0].length;col++){
                Value += array[row][col]+ " ";
            }
        }
        return Value;
    }

}
