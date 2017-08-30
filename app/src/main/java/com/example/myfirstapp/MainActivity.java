package com.example.myfirstapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    // Variables for storing A Grade values of edittext fields
    static double AP_A=0;
    static double AG_A=0;
    static double AR_A=0;

    static double VP_A=0;
    static double VG_A=0;
    static double VR_A=0;

    static double VK_A=0;
    static double WP_A=0;
    static double WR_A=0;

    // Variables for storing C Grade values of edittext fields
    static double AP_C=0;
    static double AG_C=0;
    static double AR_C=0;

    static double VP_C=0;
    static double VG_C=0;
    static double VR_C=0;

    static double VK_C=0;
    static double WP_C=0;
    static double WR_C=0;

    // variable for storing whether currently at A or C grade
    static boolean A_of_C;

    // Variables for empty fields
    static int Koop;
    static int Verkoop;
    static int Wins;



    static EditText AP_Text;
    static EditText AG_Text;
    static EditText AR_Text;

    static EditText VP_Text;
    static EditText VG_Text;
    static EditText VR_Text;

    static EditText VK_Text;
    static EditText WP_Text;
    static EditText WR_Text;

    static ToggleButton A_Of_C_Toggle;
    static ConstraintLayout Main_Layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AP_Text = (EditText) findViewById(R.id.editText1);
        AG_Text = (EditText) findViewById(R.id.editText5);
        AR_Text = (EditText) findViewById(R.id.editText6);

        VP_Text = (EditText) findViewById(R.id.editText2);
        VG_Text = (EditText) findViewById(R.id.editText7);
        VR_Text = (EditText) findViewById(R.id.editText8);

        VK_Text = (EditText) findViewById(R.id.editText3);
        WP_Text = (EditText) findViewById(R.id.editText4);
        WR_Text = (EditText) findViewById(R.id.editText9);

        A_Of_C_Toggle = (ToggleButton) findViewById(R.id.toggleButton);
        Main_Layout = (ConstraintLayout) findViewById(R.id.constraintLayout1);

    }

    public void Clear_Fields(View view) {
        AP_Text.setText("");
        AG_Text.setText("");
        AR_Text.setText("");

        VP_Text.setText("");
        VP_Text.setText("");
        VR_Text.setText("");

        VK_Text.setText("");
        WP_Text.setText("");
        WR_Text.setText("");

    }


    public void Change_Toggle(View view) {

        A_of_C = A_Of_C_Toggle.isChecked();

        if(A_of_C){

            // Change background colour to green
            Main_Layout.setBackgroundResource(android.R.color.holo_green_light);

            // Collect C Grade values
            AP_C = Double.parseDouble(AP_Text.getText().toString());
            AG_C = Double.parseDouble(AG_Text.getText().toString());
            AR_C = Double.parseDouble(AR_Text.getText().toString());

            VP_C = Double.parseDouble(VP_Text.getText().toString());
            VG_C = Double.parseDouble(VG_Text.getText().toString());
            VR_C = Double.parseDouble(VR_Text.getText().toString());

            VK_C = Double.parseDouble(VK_Text.getText().toString());
            WP_C = Double.parseDouble(WP_Text.getText().toString());
            WR_C = Double.parseDouble(WR_Text.getText().toString());

            // Input stored A Grade Values
            AP_Text.setText(Double.toString(AP_A));
            AG_Text.setText(Double.toString(AG_A));
            AR_Text.setText(Double.toString(AR_A));

            VP_Text.setText(Double.toString(VP_A));
            VP_Text.setText(Double.toString(VP_A));
            VR_Text.setText(Double.toString(VR_A));

            VK_Text.setText(Double.toString(VK_A));
            WP_Text.setText(Double.toString(WP_A));
            WR_Text.setText(Double.toString(WR_A));


        } else {
            // Change Background colour to blue
            Main_Layout.setBackgroundResource(android.R.color.holo_blue_light);

            // Collect C Grade values
            AP_A = Double.parseDouble(AP_Text.getText().toString());
            AG_A = Double.parseDouble(AG_Text.getText().toString());
            AR_A = Double.parseDouble(AR_Text.getText().toString());

            VP_A = Double.parseDouble(VP_Text.getText().toString());
            VG_A = Double.parseDouble(VG_Text.getText().toString());
            VR_A = Double.parseDouble(VR_Text.getText().toString());

            VK_A = Double.parseDouble(VK_Text.getText().toString());
            WP_A = Double.parseDouble(WP_Text.getText().toString());
            WR_A = Double.parseDouble(WR_Text.getText().toString());

            // Input stored A Grade Values
            AP_Text.setText(Double.toString(AP_C));
            AG_Text.setText(Double.toString(AG_C));
            AR_Text.setText(Double.toString(AR_C));

            VP_Text.setText(Double.toString(VP_C));
            VP_Text.setText(Double.toString(VP_C));
            VR_Text.setText(Double.toString(VR_C));

            VK_Text.setText(Double.toString(VK_C));
            WP_Text.setText(Double.toString(WP_C));
            WR_Text.setText(Double.toString(WR_C));

        }

    }


    public void Calc_AP(View view) {


        double AP;
        double AG;
        double AR;


        // Use binary counting starting from 1 to be able to identify which string is empty
        Koop = 0;
        if (AP_Text.getText().toString().equals("")) {
            Koop+=1;
        }
        if (AG_Text.getText().toString().equals("")){
            Koop+=2;
        }
        if (AR_Text.getText().toString().equals("")){
            Koop+=4;
        }

        if (Koop == 1 || Koop == 2 || Koop == 4){
            switch(Koop){
                case 1:
                    AG = Double.parseDouble(AG_Text.getText().toString());
                    AR = Double.parseDouble(AR_Text.getText().toString());
                    AP = AR/AG;
                    AP_Text.setText(Double.toString(AP));
                    break;
                case 2:
                    AP = Double.parseDouble(AP_Text.getText().toString());
                    AR = Double.parseDouble(AR_Text.getText().toString());
                    AG = AR/AP;
                    AG_Text.setText(Double.toString(AG));
                    break;
                case 4:
                    AP = Double.parseDouble(AP_Text.getText().toString());
                    AG = Double.parseDouble(AG_Text.getText().toString());
                    AR = AP*AG;
                    AR_Text.setText(Double.toString(AR));
                    break;
            }
        } else if (Koop == 0) {
            AP = Double.parseDouble(AP_Text.getText().toString());
            AG = Double.parseDouble(AG_Text.getText().toString());
            AR = Double.parseDouble(AR_Text.getText().toString());
            if (AR != AP*AG){
                Toast.makeText(getApplicationContext(),"Konflik by Koop",Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(getApplicationContext(),"Onvolledig by Koop",Toast.LENGTH_SHORT).show();
        }
    }




    public void Calc_VP(View view) {

        double VP;
        double VG;
        double VR;

        double VO;
        double DI;
        double Dae;
        double Uitslag;
        boolean Bereken_Koop;
        boolean Bereken_Verkoop;
        boolean Bereken_Wins;

        // Check if A or C Grade
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

        // Use binary counting starting from 1 to be able to identify which string is empty
        Verkoop = 0;
        if (VP_Text.getText().toString().equals("")) {
            Verkoop+=1;
        }
        if (VG_Text.getText().toString().equals("")){
            Verkoop+=2;
        }
        if (VR_Text.getText().toString().equals("")){
            Verkoop+=4;
        }

        if (Verkoop == 1 || Verkoop == 2 || Verkoop == 4){
            switch(Verkoop){
                case 1:
                    VG = Double.parseDouble(VG_Text.getText().toString());
                    VR = Double.parseDouble(VR_Text.getText().toString());
                    VP = VR/(VG*Uitslag);
                    VP_Text.setText(Double.toString(VP));
                    break;
                case 2:
                    VP = Double.parseDouble(VP_Text.getText().toString());
                    VR = Double.parseDouble(VR_Text.getText().toString());
                    VG = VR/(VP*Uitslag);
                    VG_Text.setText(Double.toString(VG));
                    break;
                case 4:
                    VP = Double.parseDouble(VP_Text.getText().toString());
                    VG = Double.parseDouble(VG_Text.getText().toString());
                    VR = VP*(VG*Uitslag);
                    VR_Text.setText(Double.toString(VR));
                    break;
            }
        } else if (Verkoop == 0) {
            VP = Double.parseDouble(VP_Text.getText().toString());
            VG = Double.parseDouble(VG_Text.getText().toString());
            VR = Double.parseDouble(VR_Text.getText().toString());
            if (VR != VP*Uitslag*VG){
                Toast.makeText(getApplicationContext(),"Konflik by Verkoop",Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(getApplicationContext(),"Onvolledig by Verkoop",Toast.LENGTH_SHORT).show();
        }

    }



    public void Calc_WP(View view) {

        double AP;
        double AG;
        double AR;

        double VP;
        double VG;
        double VR;

        double VK;
        double WP;
        double WR;

        double VO;
        double DI;
        double Dae;
        double Uitslag;
        boolean Bereken_Koop;
        boolean Bereken_Verkoop;
        boolean Bereken_Wins;

        // Check if A or C Grade
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

        // Doen eenvoudige berekeninge

        Koop = 0;
        if (AP_Text.getText().toString().equals("")) {
            Koop+=1;
        }
        if (AG_Text.getText().toString().equals("")){
            Koop+=2;
        }
        if (AR_Text.getText().toString().equals("")){
            Koop+=4;
        }

        Verkoop = 0;
        if (VP_Text.getText().toString().equals("")) {
            Verkoop+=1;
        }
        if (VG_Text.getText().toString().equals("")){
            Verkoop+=2;
        }
        if (VR_Text.getText().toString().equals("")){
            Verkoop+=4;
        }

        Wins = 0;
        if (VK_Text.getText().toString().equals("")) {
            Wins+=1;
        }
        if (WP_Text.getText().toString().equals("")){
            Wins+=2;
        }
        if (WR_Text.getText().toString().equals("")){
            Wins+=4;
        }



        // Fill out Koop section
        switch(Koop){
            case 0:
                AP = Double.parseDouble(AP_Text.getText().toString());
                AG = Double.parseDouble(AG_Text.getText().toString());
                AR = Double.parseDouble(AR_Text.getText().toString());
                if (AR != AP*AG){
                    Toast.makeText(getApplicationContext(),"Konflik by Koop",Toast.LENGTH_SHORT).show();
                }
                break;
            case 1:
                AG = Double.parseDouble(AG_Text.getText().toString());
                AR = Double.parseDouble(AR_Text.getText().toString());
                AP = AR/AG;
                AP_Text.setText(Double.toString(AP));
                break;
            case 2:
                AP = Double.parseDouble(AP_Text.getText().toString());
                AR = Double.parseDouble(AR_Text.getText().toString());
                AG = AR/AP;
                AG_Text.setText(Double.toString(AG));
                break;
            case 3:
                // Calc AG from VG
                if (Verkoop != 2 ||Verkoop != 3 ||Verkoop != 6 ||Verkoop != 7){
                    VG = Double.parseDouble(VG_Text.getText().toString());
                    AR = Double.parseDouble(AR_Text.getText().toString());
                    AG = VG / Math.pow((1 + VO * DI), Dae);
                    AP = AR/AG;
                    AG_Text.setText(Double.toString(AG));
                    AP_Text.setText(Double.toString(AP));
                }
                break;
            case 4:
                AP = Double.parseDouble(AP_Text.getText().toString());
                AG = Double.parseDouble(AG_Text.getText().toString());
                AR = AP*AG;
                AR_Text.setText(Double.toString(AR));
                break;
            case 5:
                // Calculate next round
                break;

            case 6:
                // Calc AG from VG
                if (Verkoop != 2 ||Verkoop != 3 ||Verkoop != 6 ||Verkoop != 7){
                    VG = Double.parseDouble(VG_Text.getText().toString());
                    AP = Double.parseDouble(AP_Text.getText().toString());
                    AG = VG / Math.pow((1 + VO * DI), Dae);
                    AR = AG*AP;
                    AG_Text.setText(Double.toString(AG));
                    AR_Text.setText(Double.toString(AR));
                }
                break;
            case 7:
                // Calc AG from VG
                if (Verkoop != 2 ||Verkoop != 3 ||Verkoop != 6 ||Verkoop != 7){
                    VG = Double.parseDouble(VG_Text.getText().toString());
                    AG = VG / Math.pow((1 + VO * DI), Dae);
                    AG_Text.setText(Double.toString(AG));
                } else {
                    Toast.makeText(getApplicationContext(),"Onvoldoende by Koop",Toast.LENGTH_SHORT).show();
                }
                break;

        }

        // Fill out Verkoop
        switch (Verkoop) {
            case 0:
                VP = Double.parseDouble(VP_Text.getText().toString());
                VG = Double.parseDouble(VG_Text.getText().toString());
                VR = Double.parseDouble(VR_Text.getText().toString());
                if (VR != VP*Uitslag*VG){
                    Toast.makeText(getApplicationContext(),"Konflik by Verkoop",Toast.LENGTH_SHORT).show();
                }
                break;
            case 1:
                VG = Double.parseDouble(VG_Text.getText().toString());
                VR = Double.parseDouble(VR_Text.getText().toString());
                VP = VR/(VG*Uitslag);
                VP_Text.setText(Double.toString(VP));
                break;
            case 2:
                VP = Double.parseDouble(VP_Text.getText().toString());
                VR = Double.parseDouble(VR_Text.getText().toString());
                VG = VR/(VP*Uitslag);
                VG_Text.setText(Double.toString(VG));
                break;
            case 3:
                if (Koop != 2 || Koop!= 3 || Koop!= 6 || Koop!= 7){
                    // Calculate VG
                    AG = Double.parseDouble(AG_Text.getText().toString());
                    VR = Double.parseDouble(VR_Text.getText().toString());
                    VG = AG * Math.pow((1 + VO * DI), Dae);
                    VP = VR/(VG*Uitslag);
                    VG_Text.setText(Double.toString(VG));
                    VP_Text.setText(Double.toString(VP));
                }
                break;
            case 4:
                VP = Double.parseDouble(VP_Text.getText().toString());
                VG = Double.parseDouble(VG_Text.getText().toString());
                VR = VP*(VG*Uitslag);
                VR_Text.setText(Double.toString(VR));
                break;
            case 5:
                // Calculate in next section
                break;
            case 6:
                if (Koop != 2 || Koop!= 3 || Koop!= 6 || Koop!= 7){
                    // Calculate VG
                    AG = Double.parseDouble(AG_Text.getText().toString());
                    VP = Double.parseDouble(VP_Text.getText().toString());
                    VG = AG * Math.pow((1 + VO * DI), Dae);
                    VR = VP*(VG*Uitslag);
                    VG_Text.setText(Double.toString(VG));
                    VR_Text.setText(Double.toString(VR));
                }
                break;
            case 7:
                if (Koop != 2 || Koop!= 3 || Koop!= 6 || Koop!= 7){
                    // Calculate VG
                    AG = Double.parseDouble(AG_Text.getText().toString());
                    VG = AG * Math.pow((1 + VO * DI), Dae);
                    VG_Text.setText(Double.toString(VG));
                }
                Toast.makeText(getApplicationContext(),"Onvoldoende by Verkoop",Toast.LENGTH_SHORT).show();
                break;
            }


        // Calculate further




        // Bereken Wins
        if (Wins == 1 || Wins ==3 || Wins == 5 || Wins == 7){
            Toast.makeText(getApplicationContext(),"Spesifiseer 'n Voerkoste",Toast.LENGTH_SHORT).show();

        } else if(Wins == 0 ||Wins == 2 ||Wins == 4 || Wins == 6){
            switch(Wins){
                case 0:
                    // heelwaarskynlik overspecified
                    Toast.makeText(getApplicationContext(),"Konflik by Wins",Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    if(Koop == 5){
                        if(Verkoop != 5){
                            VR = Double.parseDouble(VR_Text.getText().toString());
                            WP = Double.parseDouble(WP_Text.getText().toString());
                            VG = Double.parseDouble(VG_Text.getText().toString());
                            AG = Double.parseDouble(AG_Text.getText().toString());
                            VK = Double.parseDouble(VK_Text.getText().toString())/1000;
                            AR = (VR*100)/WP - (VG-AG)*VK/VO;
                            AP = AR/AG;
                            WR = VR - AR - (VG-AG)*VK/VO;
                            AR_Text.setText(Double.toString(AR));
                            AP_Text.setText(Double.toString(AP));
                            WR_Text.setText(Double.toString(WR));
                        }
                    } else if (Verkoop ==5){
                        if (Koop !=5){
                            WP = Double.parseDouble(WP_Text.getText().toString());
                            AR = Double.parseDouble(AR_Text.getText().toString());
                            VG = Double.parseDouble(VG_Text.getText().toString());
                            AG = Double.parseDouble(AG_Text.getText().toString());
                            VK = Double.parseDouble(VK_Text.getText().toString())/1000;
                            VR = (WP/100+1)*(AR+(VG-AG)*VK/VO);
                            VP = VR/(VG*Uitslag);
                            WR = VR - AR - (VG-AG)*VK/VO;
                            VR_Text.setText(Double.toString(VR));
                            VP_Text.setText(Double.toString(VP));
                            WR_Text.setText(Double.toString(WR));
                        }

                    } else {
                        Toast.makeText(getApplicationContext(),"Onvolledige inlighting",Toast.LENGTH_SHORT).show();
                    }
                    break;
                case 2:
                    if(Koop == 5){
                        if(Verkoop != 5){
                            VR = Double.parseDouble(VR_Text.getText().toString());
                            WR = Double.parseDouble(WR_Text.getText().toString());
                            VG = Double.parseDouble(VG_Text.getText().toString());
                            AG = Double.parseDouble(AG_Text.getText().toString());
                            VK = Double.parseDouble(VK_Text.getText().toString())/1000;
                            AR = VR - WR - ((VG-AG)*VK)/VO;
                            AP = AR/AG;
                            WP = ((VR/(AR+(VG-AG)*VK/VO))-1)*100;
                            AR_Text.setText(Double.toString(AR));
                            AP_Text.setText(Double.toString(AP));
                            WP_Text.setText(Double.toString(WP));
                        }
                    } else if (Verkoop ==5){
                        if (Koop !=5){
                            AR = Double.parseDouble(AR_Text.getText().toString());
                            WR = Double.parseDouble(WR_Text.getText().toString());
                            VG = Double.parseDouble(VG_Text.getText().toString());
                            AG = Double.parseDouble(AG_Text.getText().toString());
                            VK = Double.parseDouble(VK_Text.getText().toString())/1000;
                            VR = AR + WR + ((VG-AG)*VK)/VO;
                            VP = VR/(VG*Uitslag);
                            WP = ((VR/(AR+(VG-AG)*VK/VO))-1)*100;
                            VR_Text.setText(Double.toString(VR));
                            VP_Text.setText(Double.toString(VP));
                            WP_Text.setText(Double.toString(WP));
                        }

                    } else {
                        Toast.makeText(getApplicationContext(),"Onvolledige inlighting",Toast.LENGTH_SHORT).show();
                    }
                    break;
                case 6:
                    if (Koop == 0 & Verkoop ==0){
                        AR = Double.parseDouble(AR_Text.getText().toString());
                        VR = Double.parseDouble(VR_Text.getText().toString());
                        VG = Double.parseDouble(VG_Text.getText().toString());
                        AG = Double.parseDouble(AG_Text.getText().toString());
                        VK = Double.parseDouble(VK_Text.getText().toString())/1000;
                        WP = ((VR/(AR+(VG-AG)*VK/VO))-1)*100;
                        WR = VR - AR - (VG-AG)*VK/VO;
                        WP_Text.setText(Double.toString(WP));
                        WR_Text.setText(Double.toString(WR));

                    } else {
                        Toast.makeText(getApplicationContext(),"Onvolledige inlighting",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
        }
    }
}