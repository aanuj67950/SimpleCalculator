package myfirstapkas.com.calculator;


import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.graphics.Region;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button Add,Sub,Div,Mul,Equal,One,Two,Three,Four ,Five,Six,Seven,Eight,Nine,Zero;
TextView Firstnum,Secnum,Result,Operator,Clear;
int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Add =findViewById(R.id.add);
        Sub=findViewById(R.id.sub);
        Div=findViewById(R.id.div);
        Equal=findViewById(R.id.equal);
        One=findViewById(R.id.one);
        Two=findViewById(R.id.two);
        Three=findViewById(R.id.three);
        Four=findViewById(R.id.four);
        Five=findViewById(R.id.five);
        Six=findViewById(R.id.six);
        Seven=findViewById(R.id.seven);
        Eight=findViewById(R.id.eight);
        Nine=findViewById(R.id.nine);
        Zero=findViewById(R.id.zero);
        Mul=findViewById(R.id.mul);
        Firstnum=findViewById(R.id.firstnum);
        Secnum=findViewById(R.id.secondnum);
        Result=findViewById(R.id.result);
        Operator=findViewById(R.id.operator);
        Clear=findViewById(R.id.clear);


       Add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                num=1;
               Operator.setText("+");
               }
       });
       Sub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                num=2;
                Operator.setText("-");

           }
       });

       Div.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                num=3;
                Operator.setText("/");
           }
       });

       Mul.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            num=4;
               Operator.setText("*");
           }
       });
       Zero.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               if (num==1||num==2||num==3||num==4){
                   int num2=0;
                   num2=Integer.parseInt(Secnum.getText().toString());
                   Secnum.setText(num2+"0");

               }
               else
               {
                   int num1=0;
                   num1=Integer.parseInt(Firstnum.getText().toString());
                   Firstnum.setText(num1+"0");
               }



           }
       });
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num==1||num==2||num==3||num==4){
                    int num2=0;
                    num2=Integer.parseInt(Secnum.getText().toString());
                    Secnum.setText(num2+"1");

                }
                else{
                    int num1=0;
                    num1=Integer.parseInt(Firstnum.getText().toString());
                    Firstnum.setText(num1+"1");

                }

            }
        });
        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num==1||num==2||num==3||num==4){
                    int num2=0;
                    num2=Integer.parseInt(Secnum.getText().toString());
                    Secnum.setText(num2+"2");

                }
                else
                {int num1=0;
                    num1=Integer.parseInt(Firstnum.getText().toString());
                    Firstnum.setText(num1+"2");

                }
            }
        });
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num==1||num==2||num==3||num==4){
                    int num2=0;
                    num2=Integer.parseInt(Secnum.getText().toString());
                    Secnum.setText(num2+"3");

                }
                else{
                    int num1=0;
                    num1=Integer.parseInt(Firstnum.getText().toString());
                    Firstnum.setText(num1+"3");
                }

            }
        });
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num==1||num==2||num==3||num==4){
                    int num2=0;
                    num2=Integer.parseInt(Secnum.getText().toString());
                    Secnum.setText(num2+"4");
                }
                else {
                         int num1=0;
                    num1=Integer.parseInt(Firstnum.getText().toString());
                    Firstnum.setText(num1+"4");

                }


            }
        });
        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num==1||num==2||num==3||num==4){
                    int num2=0;
                    num2=Integer.parseInt(Secnum.getText().toString());
                    Secnum.setText(num2+"5");

                }
                else
                {
                    int num1=0;
                    num1=Integer.parseInt(Firstnum.getText().toString());
                    Firstnum.setText(num1+"5");
                }
            }
        });
        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num==1||num==2||num==3||num==4){
                    int num2=0;
                    num2=Integer.parseInt(Secnum.getText().toString());
                    Secnum.setText(num2+"6");

                }
                else
                { int num1=0;
                    num1=Integer.parseInt(Firstnum.getText().toString());
                    Firstnum.setText(num1+"6");

                }

            }
        });
        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num==1||num==2||num==3||num==4){
                    int num2=0;
                    num2=Integer.parseInt(Secnum.getText().toString());
                    Secnum.setText(num2+"7");

                }
                else {
                    int num1=0;
                    num1=Integer.parseInt(Firstnum.getText().toString());
                    Firstnum.setText(num1+"7");
                }
            }
        });
        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num==1||num==2||num==3||num==4){
                    int num2=0;
                    num2=Integer.parseInt(Secnum.getText().toString());
                    Secnum.setText(num2+"8");

                }
                else {
                    int num1=0;
                    num1=Integer.parseInt(Firstnum.getText().toString());
                    Firstnum.setText(num1+"8");
                }

            }
        });
        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num==1||num==2||num==3||num==4){
                    int num2=0;
                    num2=Integer.parseInt(Secnum.getText().toString());
                    Secnum.setText(num2+"9");

                }
                else{ int num1=0;
                    num1=Integer.parseInt(Firstnum.getText().toString());
                    Firstnum.setText(num1+"9");}

            }
        });
        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float first,second,result;
                first=Float.parseFloat(Firstnum.getText().toString());
                second=Float.parseFloat(Secnum.getText().toString());
                if(num==1){result=first+second;
                Result.setText(""+result);
            }
            if(num==2){
              result=first-second;
              Result.setText(""+result);
            }
            if(num==3)
            {
                result=first/second;
                Result.setText(""+result);
            }
            if (num==4){
                    result=first*second;
                    Result.setText(""+result);
            }


            }

        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Firstnum.setText("0");
                Secnum.setText("0");
                num=0;
                Result.setText("0");
                Operator.setText("Operator");
            }
        });

    }
}
