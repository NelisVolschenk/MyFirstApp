package com.example.myfirstapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    double AP_A=0;
    double AP_C=0;
    double VP_A=0;
    double VP_C=0;
    double VK_A=0;
    double VK_C=0;
    double WP_A=0;
    double WP_C=0;
    double Gewig_A=0;
    double Gewig_C=0;
    double Prys_A=0;
    double Prys_C=0;


    public void Clear_Fields(View view) {


    }


    public void Change_Toggle(View view) {



        boolean A_of_C;

        EditText AP_Text = (EditText) findViewById(R.id.editText1);
        EditText VP_Text = (EditText) findViewById(R.id.editText2);
        EditText VK_Text = (EditText) findViewById(R.id.editText3);
        EditText WP_Text = (EditText) findViewById(R.id.editText4);
        EditText Gewig_Text = (EditText) findViewById(R.id.editText5);
        EditText Prys_Text = (EditText) findViewById(R.id.editText6);
        ToggleButton A_Of_C_Toggle = (ToggleButton) findViewById(R.id.toggleButton);
        ConstraintLayout Main_Layout = (ConstraintLayout) findViewById(R.id.constraintLayout1);

        double AP;
        double VP;
        double VK;
        double WP;
        double Gewig;
        double Prys;
        double VO;
        double DI;
        double Dae;
        double Uitslag;



        A_of_C = A_Of_C_Toggle.isChecked();

        if(A_of_C){

            // Change background colour to green
            Main_Layout.setBackgroundResource(android.R.color.holo_green_light);

            // Collect C Grade values
            AP_C = Double.parseDouble(AP_Text.getText().toString());
            VP_C = Double.parseDouble(VP_Text.getText().toString());
            VK_C = Double.parseDouble(VK_Text.getText().toString());
            WP_C = Double.parseDouble(WP_Text.getText().toString());
            Gewig_C = Double.parseDouble(Gewig_Text.getText().toString());
            Prys_C = Double.parseDouble(Prys_Text.getText().toString());

            // Input stored A Grade Values
            AP_Text.setText(Double.toString(AP_A));
            VP_Text.setText(Double.toString(VP_A));
            VK_Text.setText(Double.toString(VK_A));
            WP_Text.setText(Double.toString(WP_A));
            Gewig_Text.setText(Double.toString(Gewig_A));
            Prys_Text.setText(Double.toString(Prys_A));


        } else {
            // Change Background colour to blue
            Main_Layout.setBackgroundResource(android.R.color.holo_blue_light);

            // Collect A Grade values
            AP_A = Double.parseDouble(AP_Text.getText().toString());
            VP_A = Double.parseDouble(VP_Text.getText().toString());
            VK_A = Double.parseDouble(VK_Text.getText().toString());
            WP_A = Double.parseDouble(WP_Text.getText().toString());
            Gewig_A = Double.parseDouble(Gewig_Text.getText().toString());
            Prys_A = Double.parseDouble(Prys_Text.getText().toString());


            // Input stored C Grade Values
            AP_Text.setText(Double.toString(AP_C));
            VP_Text.setText(Double.toString(VP_C));
            VK_Text.setText(Double.toString(VK_C));
            WP_Text.setText(Double.toString(WP_C));
            Gewig_Text.setText(Double.toString(Gewig_C));
            Prys_Text.setText(Double.toString(Prys_C));

        }

    }


    public void Calc_AP(View view) {

        double AP_A=0;
        double AP_C=0;
        double VP_A=0;
        double VP_C=0;
        double VK_A=0;
        double VK_C=0;
        double WP_A=0;
        double WP_C=0;
        double Gewig_A=0;
        double Gewig_C=0;
        double Prys_A=0;
        double Prys_C=0;
        boolean A_of_C;

        EditText AP_Text = (EditText) findViewById(R.id.editText1);
        EditText VP_Text = (EditText) findViewById(R.id.editText2);
        EditText VK_Text = (EditText) findViewById(R.id.editText3);
        EditText WP_Text = (EditText) findViewById(R.id.editText4);
        EditText Gewig_Text = (EditText) findViewById(R.id.editText5);
        EditText Prys_Text = (EditText) findViewById(R.id.editText6);
        ToggleButton A_Of_C_Toggle = (ToggleButton) findViewById(R.id.toggleButton);
        ConstraintLayout Main_Layout = (ConstraintLayout) findViewById(R.id.constraintLayout1);

        double AP;
        double VP;
        double VK;
        double WP;
        double Gewig;
        double Prys;
        double VO;
        double DI;
        double Dae;
        double Uitslag;

        //AP = Double.parseDouble(AP_Text.getText().toString());
        VP = Double.parseDouble(VP_Text.getText().toString());
        VK = Double.parseDouble(VK_Text.getText().toString());
        WP = Double.parseDouble(WP_Text.getText().toString());
        Gewig = Double.parseDouble(Gewig_Text.getText().toString());
        //Prys = Double.parseDouble(Prys_Text.getText().toString());
        A_of_C = A_Of_C_Toggle.isChecked();


        if (A_of_C){

            VO = 1.0/6;
            DI = 3.0/100;
            Dae = 139;
            Uitslag = 56.0/100;

        } else {

            VO = 1.0/6;
            DI = 3.0/100;
            Dae = 68;
            Uitslag = 50.0/100;

        }



        AP = (VP*Uitslag*Math.pow((1+VO*DI),Dae)*(365/Dae))/(365/Dae+WP/100) - (Math.pow((1+VO*DI),Dae)-1)*VK/(1000*VO);
        AP = Math.round(AP*100)/100.0;
        AP_Text.setText(Double.toString(AP));

        Prys = Gewig * AP;
        Prys_Text.setText(Double.toString(Prys));
    }


    /*

    public void Calc_VP(View view) {

        double AP_A=0;
        double AP_C=0;
        double VP_A=0;
        double VP_C=0;
        double VK_A=0;
        double VK_C=0;
        double WP_A=0;
        double WP_C=0;
        double Gewig_A=0;
        double Gewig_C=0;
        double Prys_A=0;
        double Prys_C=0;
        boolean A_of_C;

        EditText AP_Text = (EditText) findViewById(R.id.editText1);
        EditText VP_Text = (EditText) findViewById(R.id.editText2);
        EditText VK_Text = (EditText) findViewById(R.id.editText3);
        EditText WP_Text = (EditText) findViewById(R.id.editText4);
        EditText Gewig_Text = (EditText) findViewById(R.id.editText5);
        EditText Prys_Text = (EditText) findViewById(R.id.editText6);
        ToggleButton A_Of_C_Toggle = (ToggleButton) findViewById(R.id.toggleButton);
        ConstraintLayout Main_Layout = (ConstraintLayout) findViewById(R.id.constraintLayout1);

        double AP;
        double VP;
        double VK;
        double WP;
        double Gewig;
        double Prys;
        double VO;
        double DI;
        double Dae;
        double Uitslag;

        AP = Double.parseDouble(AP_Text.getText().toString());
        //VP = Double.parseDouble(VP_Text.getText().toString());
        VK = Double.parseDouble(VK_Text.getText().toString());
        WP = Double.parseDouble(WP_Text.getText().toString());
        Gewig = Double.parseDouble(Gewig_Text.getText().toString());
        A_of_C = A_Of_C_Toggle.isChecked();

        if (A_of_C){

            VO = 1.0/6;
            DI = 3.0/100;
            Dae = 139;
            Uitslag = 56.0/100;

        } else {

            VO = 1.0/6;
            DI = 3.0/100;
            Dae = 68;
            Uitslag = 50.0/100;

        }

        Prys = Gewig * AP;
        Prys_Text.setText(Double.toString(Prys));

        VP = (AP+(Math.pow((1+VO*DI),Dae)-1)*VK/(1000*VO))*(365/Dae+WP/100)/(Uitslag*Math.pow((1+VO*DI),Dae)*365/Dae);
        VP_Text.setText(Double.toString(VP));

    }


    public void Calc_VK(View view) {

        double AP_A=0;
        double AP_C=0;
        double VP_A=0;
        double VP_C=0;
        double VK_A=0;
        double VK_C=0;
        double WP_A=0;
        double WP_C=0;
        double Gewig_A=0;
        double Gewig_C=0;
        double Prys_A=0;
        double Prys_C=0;
        boolean A_of_C;

        EditText AP_Text = (EditText) findViewById(R.id.editText1);
        EditText VP_Text = (EditText) findViewById(R.id.editText2);
        EditText VK_Text = (EditText) findViewById(R.id.editText3);
        EditText WP_Text = (EditText) findViewById(R.id.editText4);
        EditText Gewig_Text = (EditText) findViewById(R.id.editText5);
        EditText Prys_Text = (EditText) findViewById(R.id.editText6);
        ToggleButton A_Of_C_Toggle = (ToggleButton) findViewById(R.id.toggleButton);
        ConstraintLayout Main_Layout = (ConstraintLayout) findViewById(R.id.constraintLayout1);

        double AP;
        double VP;
        double VK;
        double WP;
        double Gewig;
        double Prys;
        double VO;
        double DI;
        double Dae;
        double Uitslag;

        AP = Double.parseDouble(AP_Text.getText().toString());
        VP = Double.parseDouble(VP_Text.getText().toString());
        //VK = Double.parseDouble(VK_Text.getText().toString());
        WP = Double.parseDouble(WP_Text.getText().toString());
        Gewig = Double.parseDouble(Gewig_Text.getText().toString());
        A_of_C = A_Of_C_Toggle.isChecked();

        if (A_of_C){

            VO = 1.0/6;
            DI = 3.0/100;
            Dae = 139;
            Uitslag = 56.0/100;

        } else {

            VO = 1.0/6;
            DI = 3.0/100;
            Dae = 68;
            Uitslag = 50.0/100;

        }

        Prys = Gewig * AP;
        Prys_Text.setText(Double.toString(Prys));

        VK = ((VP*Uitslag*Math.pow((1+VO*DI),Dae)*(365/Dae))/(365/Dae+WP/100)-AP)*(1000*VO)/(Math.pow((1+VO*DI),Dae)-1);
        VK = Math.round(VK*100)/100.0;
        VK_Text.setText(Double.toString(VK));

    }

    public void Calc_WP(View view) {

        double AP_A=0;
        double AP_C=0;
        double VP_A=0;
        double VP_C=0;
        double VK_A=0;
        double VK_C=0;
        double WP_A=0;
        double WP_C=0;
        double Gewig_A=0;
        double Gewig_C=0;
        double Prys_A=0;
        double Prys_C=0;
        boolean A_of_C;

        EditText AP_Text = (EditText) findViewById(R.id.editText1);
        EditText VP_Text = (EditText) findViewById(R.id.editText2);
        EditText VK_Text = (EditText) findViewById(R.id.editText3);
        EditText WP_Text = (EditText) findViewById(R.id.editText4);
        EditText Gewig_Text = (EditText) findViewById(R.id.editText5);
        EditText Prys_Text = (EditText) findViewById(R.id.editText6);
        ToggleButton A_Of_C_Toggle = (ToggleButton) findViewById(R.id.toggleButton);
        ConstraintLayout Main_Layout = (ConstraintLayout) findViewById(R.id.constraintLayout1);

        double AP;
        double VP;
        double VK;
        double WP;
        double Gewig;
        double Prys;
        double VO;
        double DI;
        double Dae;
        double Uitslag;

        AP = Double.parseDouble(AP_Text.getText().toString());
        VP = Double.parseDouble(VP_Text.getText().toString());
        VK = Double.parseDouble(VK_Text.getText().toString());
        //WP = Double.parseDouble(WP_Text.getText().toString());
        Gewig = Double.parseDouble(Gewig_Text.getText().toString());
        A_of_C = A_Of_C_Toggle.isChecked();

        if (A_of_C){

            VO = 1.0/6;
            DI = 3.0/100;
            Dae = 139;
            Uitslag = 56.0/100;

        } else {

            VO = 1.0/6;
            DI = 3.0/100;
            Dae = 68;
            Uitslag = 50.0/100;

        }

        Prys = Gewig * AP;
        Prys_Text.setText(Double.toString(Prys));


        WP=(((VP*Uitslag*Math.pow((1+VO*DI),Dae))/(AP+(Math.pow((1+VO*DI),Dae)-1)*VK/(VO*1000))-1)*365/Dae)*100;
        WP=(double) Math.round(WP*100)/100.0;
        WP_Text.setText(Double.toString(WP));

    }

    */

}