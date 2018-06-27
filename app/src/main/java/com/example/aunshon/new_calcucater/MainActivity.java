package com.example.aunshon.new_calcucater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bequal,bpersentage,bclear,bplus,bminus,bmul,bdivision,bback;
    TextView answer,allnumbers;
    double value1=0.0,value2=0.0,ans;
    //boolean add,sub,mul,div;
    boolean solved=false,solon=false;
    String sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= (Button) findViewById(R.id.one_btn);
        b2=(Button) findViewById(R.id.two_btn);
        b3=(Button)findViewById(R.id.three_btn);
        b4=(Button)findViewById(R.id.four_btn);
        b5=(Button)findViewById(R.id.five_btn);
        b6=(Button)findViewById(R.id.six_btn);
        b7=(Button)findViewById(R.id.seven_btn);
        b8=(Button)findViewById(R.id.eight_btn);
        b9=(Button)findViewById(R.id.nine_btn);
        b0=(Button)findViewById(R.id.zero_btn);
        bp=(Button)findViewById(R.id.point_btn);
        bequal=(Button)findViewById(R.id.equal_btn);
        bclear=(Button)findViewById(R.id.clear_btn);
        bplus=(Button)findViewById(R.id.plus_btn);
        bmul=(Button)findViewById(R.id.mul_btn);
        bminus=(Button)findViewById(R.id.minus_btn);
        bdivision=(Button)findViewById(R.id.division_btn);
        bback=(Button)findViewById(R.id.back_btn);

        answer=(TextView) findViewById(R.id.ans);
        allnumbers=(TextView)findViewById(R.id.all_num);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solon==true || solved==true){
                    answer.setText(null);
                    solon=false;
                    solved=false;
                }
                answer.setText(answer.getText()+"1");
            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solon==true || solved==true){
                    answer.setText(null);
                    solved=false;
                    solon=false;
                }
                answer.setText(answer.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solon==true || solved==true){
                    answer.setText(null);
                    solon=false;
                    solved=false;
                }
                answer.setText(answer.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solon==true || solved==true){
                    answer.setText(null);
                    solon=false;
                    solved=false;
                }
                answer.setText(answer.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solon==true || solved==true){
                    answer.setText(null);
                    solon=false;
                    solved=false;
                }
                answer.setText(answer.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solon==true || solved==true){
                    answer.setText(null);
                    solon=false;
                    solved=false;
                }
                answer.setText(answer.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solon==true || solved==true){
                    answer.setText(null);
                    solon=false;
                    solved=false;
                }
                answer.setText(answer.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solon==true || solved==true){
                    answer.setText(null);
                    solon=false;
                    solved=false;
                }
                answer.setText(answer.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solon==true || solved==true){
                    answer.setText(null);
                    solon=false;
                    solved=false;
                }
                answer.setText(answer.getText()+"0");
            }
        });

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText("");
                allnumbers.setText("");
                solon=false;
                solved=false;
                value1=0.0;
                value2=0.0;
                sign=null;
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solon==true || solved==true){
                    answer.setText(null);
                    solon=false;
                    solved=false;
                }
                answer.setText(answer.getText()+".");
            }
        });


        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(value2==0){
                        value1=Double.parseDouble(answer.getText().toString());
                        allnumbers.setText(allnumbers.getText()+answer.getText().toString()+"+");
                        sign="+";
                        answer.setText(null);
                        value2=Double.parseDouble("1");
                    }
                    else {
                        allnumbers.setText(allnumbers.getText()+answer.getText().toString()+"+");
                        value1=value1+Double.parseDouble(answer.getText().toString());
                        answer.setText(value1+"");
                        sign="+";
                        solon=true;
                    }

                }catch (Exception e){

                    answer.setText(null);
                }


            }
        });

        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    if(value2==0){
                        value1=Double.parseDouble(answer.getText().toString());
                        allnumbers.setText(allnumbers.getText()+answer.getText().toString()+"-");
                        sign="-";
                        answer.setText(null);
                        value2=Double.parseDouble("1");
                    }
                    else {
                        allnumbers.setText(allnumbers.getText()+answer.getText().toString()+"-");
                        value1=value1-Double.parseDouble(answer.getText().toString());
                        answer.setText(value1+"");
                        sign="-";
                        solon=true;
                    }
                }
                catch (Exception e){
                    answer.setText("0");
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               try{
                   if(value2==0){
                       value1=Double.parseDouble(answer.getText().toString());
                       allnumbers.setText(allnumbers.getText()+answer.getText().toString()+"*");
                       sign="*";
                       answer.setText(null);
                       value2=Double.parseDouble("1");
                   }
                   else {
                       allnumbers.setText(allnumbers.getText()+answer.getText().toString()+"*");
                       value1=value1*Double.parseDouble(answer.getText().toString());
                       answer.setText(value1+"");

                       sign="*";
                       solon=true;
                   }
               }catch (Exception e){

                   answer.setText("0");
               }
            }
        });

        bdivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               try{
                   if (value2==0){
                       value1=Double.parseDouble(answer.getText().toString());
                       allnumbers.setText(allnumbers.getText()+answer.getText().toString()+"/");
                       sign="/";
                       answer.setText(null);
                       value2=Double.parseDouble("1");
                   }
                   else{
                       allnumbers.setText(allnumbers.getText()+answer.getText().toString()+"/");
                       value1=value1/Double.parseDouble(answer.getText().toString());
                       answer.setText(value1+"");
                       sign="/";
                       answer.setText(null);
                       solon=true;
                   }
               }catch (Exception e){
                   answer.setText("0");
               }

            }
        });


        bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int i = answer.getText().length();
                    answer.setText(answer.getText().subSequence(0,i-1));
                    if(answer.getText()==null){
                        value1=0.0;
                    }
                }
                catch (Exception e){
                    answer.setText("0");
                }
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allnumbers.setText(allnumbers.getText()+answer.getText().toString());
                value2=Double.parseDouble(answer.getText()+"");
               // String a= (String) allnumbers.getText();
                //allnumbers.setText( a+ value2);
                 try {
                     switch (sign){
                         case "+":
                             ans=value1+value2;
                             break;
                         case "-":
                             ans=value1-value2;
                             break;
                         case "*":
                             ans=value1*value2;
                             break;
                         case "/":
                             ans=value1/value2;
                             break;
                         default:
                     }

                     answer.setText(ans+"");
                     solon=false;
                     solved=false;
                     value2=0.0;
                     value1=0.0;
                     sign=null;

                 }catch (Exception e){
                     answer.setText("0");
                 }


            }
        });
    }


}
