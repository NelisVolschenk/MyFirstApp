package com.example.myfirstapp;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;
import java.text.DecimalFormat;

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



    EditText AP_Text;
    EditText AG_Text;
    EditText AR_Text;

    EditText VP_Text;
    EditText VG_Text;
    EditText VR_Text;

    EditText VK_Text;
    EditText WP_Text;
    EditText WR_Text;

    ToggleButton A_Of_C_Toggle;
    ConstraintLayout Main_Layout;

    DecimalFormat zeroprecision = new DecimalFormat("0");
    DecimalFormat twoprecision = new DecimalFormat("0.##");



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
        VG_Text.setText("");
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
            if (!AP_Text.getText().toString().equals("")){
                AP_C = Double.parseDouble(AP_Text.getText().toString());
            } else {
                AP_C = 0;
            }
            if (!AG_Text.getText().toString().equals("")){
                AG_C = Double.parseDouble(AG_Text.getText().toString());
            } else {
                AG_C = 0;
            }
            if (!AR_Text.getText().toString().equals("")){
                AR_C = Double.parseDouble(AR_Text.getText().toString());
            } else {
                AR_C = 0;
            }


            if (!VP_Text.getText().toString().equals("")){
                VP_C = Double.parseDouble(VP_Text.getText().toString());
            } else {
                VP_C = 0;
            }
            if (!VG_Text.getText().toString().equals("")){
                VG_C = Double.parseDouble(VG_Text.getText().toString());
            } else {
                VG_C = 0;
            }
            if (!VR_Text.getText().toString().equals("")){
                VR_C = Double.parseDouble(VR_Text.getText().toString());
            } else {
                VR_C = 0;
            }

            if (!VK_Text.getText().toString().equals("")){
                VK_C = Double.parseDouble(VK_Text.getText().toString());
            } else {
                VK_C = 0;
            }
            if (!WP_Text.getText().toString().equals("")){
                WP_C = Double.parseDouble(WP_Text.getText().toString());
            } else {
                WP_C = 0;
            }
            if (!WR_Text.getText().toString().equals("")){
                WR_C = Double.parseDouble(WR_Text.getText().toString());
            } else {
                WR_C = 0;
            }

            // Input stored A Grade Values
            if (AP_A==0){
                AP_Text.setText("");
            } else {
                AP_Text.setText(twoprecision.format(AP_A));
            }
            if (AG_A==0){
                AG_Text.setText("");
            } else {
                AG_Text.setText(zeroprecision.format(AG_A));
            }
            if (AR_A==0){
                AR_Text.setText("");
            } else {
                AR_Text.setText(zeroprecision.format(AR_A));
            }

            if (VP_A==0){
                VP_Text.setText("");
            } else {
                VP_Text.setText(twoprecision.format(VP_A));
            }
            if (VG_A==0){
                VG_Text.setText("");
            } else {
                VG_Text.setText(zeroprecision.format(VG_A));
            }
            if (VR_A==0){
                VR_Text.setText("");
            } else {
                VR_Text.setText(zeroprecision.format(VR_A));
            }

            if (VK_A==0){
                VK_Text.setText("");
            } else {
                VK_Text.setText(zeroprecision.format(VK_A));
            }
            if (WP_A==0){
                WP_Text.setText("");
            } else {
                WP_Text.setText(twoprecision.format(WP_A));
            }
            if (WR_A==0){
                WR_Text.setText("");
            } else {
                WR_Text.setText(zeroprecision.format(WR_A));
            }


        } else {
            // Change Background colour to blue
            Main_Layout.setBackgroundResource(android.R.color.holo_blue_light);

            // Collect A Grade values
            if (!AP_Text.getText().toString().equals("")){
                AP_A = Double.parseDouble(AP_Text.getText().toString());
            } else {
                AP_A = 0;
            }
            if (!AG_Text.getText().toString().equals("")){
                AG_A = Double.parseDouble(AG_Text.getText().toString());
            } else {
                AG_A = 0;
            }
            if (!AR_Text.getText().toString().equals("")){
                AR_A = Double.parseDouble(AR_Text.getText().toString());
            } else {
                AR_A = 0;
            }


            if (!VP_Text.getText().toString().equals("")){
                VP_A = Double.parseDouble(VP_Text.getText().toString());
            } else {
                VP_A = 0;
            }
            if (!VG_Text.getText().toString().equals("")){
                VG_A = Double.parseDouble(VG_Text.getText().toString());
            } else {
                VG_A = 0;
            }
            if (!VR_Text.getText().toString().equals("")){
                VR_A = Double.parseDouble(VR_Text.getText().toString());
            } else {
                VR_A = 0;
            }

            if (!VK_Text.getText().toString().equals("")){
                VK_A = Double.parseDouble(VK_Text.getText().toString());
            } else {
                VK_A = 0;
            }
            if (!WP_Text.getText().toString().equals("")){
                WP_A = Double.parseDouble(WP_Text.getText().toString());
            } else {
                WP_A = 0;
            }
            if (!WR_Text.getText().toString().equals("")){
                WR_A = Double.parseDouble(WR_Text.getText().toString());
            } else {
                WR_A = 0;
            }

            // Input stored A Grade Values
            if (AP_C==0){
                AP_Text.setText("");
            } else {
                AP_Text.setText(twoprecision.format(AP_C));
            }
            if (AG_C==0){
                AG_Text.setText("");
            } else {
                AG_Text.setText(zeroprecision.format(AG_C));
            }
            if (AR_C==0){
                AR_Text.setText("");
            } else {
                AR_Text.setText(zeroprecision.format(AR_C));
            }

            if (VP_C==0){
                VP_Text.setText("");
            } else {
                VP_Text.setText(twoprecision.format(VP_C));
            }
            if (VG_C==0){
                VG_Text.setText("");
            } else {
                VG_Text.setText(zeroprecision.format(VG_C));
            }
            if (VR_C==0){
                VR_Text.setText("");
            } else {
                VR_Text.setText(zeroprecision.format(VR_C));
            }

            if (VK_C==0){
                VK_Text.setText("");
            } else {
                VK_Text.setText(zeroprecision.format(VK_C));
            }
            if (WP_C==0){
                WP_Text.setText("");
            } else {
                WP_Text.setText(twoprecision.format(WP_C));
            }
            if (WR_C==0){
                WR_Text.setText("");
            } else {
                WR_Text.setText(zeroprecision.format(WR_C));
            }

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
                    AP_Text.setText(twoprecision.format(AP));
                    break;
                case 2:
                    AP = Double.parseDouble(AP_Text.getText().toString());
                    AR = Double.parseDouble(AR_Text.getText().toString());
                    AG = AR/AP;
                    AG_Text.setText(zeroprecision.format(AG));
                    break;
                case 4:
                    AP = Double.parseDouble(AP_Text.getText().toString());
                    AG = Double.parseDouble(AG_Text.getText().toString());
                    AR = AP*AG;
                    AR_Text.setText(zeroprecision.format(AR));
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

        double Uitslag;

        // Check if A or C Grade
        A_of_C = A_Of_C_Toggle.isChecked();
        if (A_of_C){
            Uitslag = 56.0/100;
        } else {
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
                    VP_Text.setText(twoprecision.format(VP));
                    break;
                case 2:
                    VP = Double.parseDouble(VP_Text.getText().toString());
                    VR = Double.parseDouble(VR_Text.getText().toString());
                    VG = VR/(VP*Uitslag);
                    VG_Text.setText(zeroprecision.format(VG));
                    break;
                case 4:
                    VP = Double.parseDouble(VP_Text.getText().toString());
                    VG = Double.parseDouble(VG_Text.getText().toString());
                    VR = VP*(VG*Uitslag);
                    VR_Text.setText(zeroprecision.format(VR));
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
                AP_Text.setText(twoprecision.format(AP));
                break;
            case 2:
                AP = Double.parseDouble(AP_Text.getText().toString());
                AR = Double.parseDouble(AR_Text.getText().toString());
                AG = AR/AP;
                AG_Text.setText(zeroprecision.format(AG));
                break;
            case 3:
                // Calc AG from VG
                if (Verkoop != 2 ||Verkoop != 3 ||Verkoop != 6 ||Verkoop != 7){
                    VG = Double.parseDouble(VG_Text.getText().toString());
                    AR = Double.parseDouble(AR_Text.getText().toString());
                    AG = VG / Math.pow((1 + VO * DI), Dae);
                    AP = AR/AG;
                    AG_Text.setText(zeroprecision.format(AG));
                    AP_Text.setText(twoprecision.format(AP));
                }
                break;
            case 4:
                AP = Double.parseDouble(AP_Text.getText().toString());
                AG = Double.parseDouble(AG_Text.getText().toString());
                AR = AP*AG;
                AR_Text.setText(zeroprecision.format(AR));
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
                    AG_Text.setText(zeroprecision.format(AG));
                    AR_Text.setText(zeroprecision.format(AR));
                }
                break;
            case 7:
                // Calc AG from VG
                if (Verkoop != 2 ||Verkoop != 3 ||Verkoop != 6 ||Verkoop != 7){
                    VG = Double.parseDouble(VG_Text.getText().toString());
                    AG = VG / Math.pow((1 + VO * DI), Dae);
                    AG_Text.setText(zeroprecision.format(AG));
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
                VP_Text.setText(twoprecision.format(VP));
                break;
            case 2:
                VP = Double.parseDouble(VP_Text.getText().toString());
                VR = Double.parseDouble(VR_Text.getText().toString());
                VG = VR/(VP*Uitslag);
                VG_Text.setText(zeroprecision.format(VG));
                break;
            case 3:
                if (Koop != 2 || Koop!= 3 || Koop!= 6 || Koop!= 7){
                    // Calculate VG
                    AG = Double.parseDouble(AG_Text.getText().toString());
                    VR = Double.parseDouble(VR_Text.getText().toString());
                    VG = AG * Math.pow((1 + VO * DI), Dae);
                    VP = VR/(VG*Uitslag);
                    VG_Text.setText(zeroprecision.format(VG));
                    VP_Text.setText(twoprecision.format(VP));
                }
                break;
            case 4:
                VP = Double.parseDouble(VP_Text.getText().toString());
                VG = Double.parseDouble(VG_Text.getText().toString());
                VR = VP*(VG*Uitslag);
                VR_Text.setText(zeroprecision.format(VR));
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
                    VG_Text.setText(zeroprecision.format(VG));
                    VR_Text.setText(zeroprecision.format(VR));
                }
                break;
            case 7:
                if (Koop != 2 || Koop!= 3 || Koop!= 6 || Koop!= 7){
                    // Calculate VG
                    AG = Double.parseDouble(AG_Text.getText().toString());
                    VG = AG * Math.pow((1 + VO * DI), Dae);
                    VG_Text.setText(zeroprecision.format(VG));
                }
                Toast.makeText(getApplicationContext(),"Onvoldoende by Verkoop",Toast.LENGTH_SHORT).show();
                break;
            }


        // Calculate further

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
                            AR_Text.setText(zeroprecision.format(AR));
                            AP_Text.setText(twoprecision.format(AP));
                            WR_Text.setText(zeroprecision.format(WR));
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
                            VR_Text.setText(zeroprecision.format(VR));
                            VP_Text.setText(twoprecision.format(VP));
                            WR_Text.setText(zeroprecision.format(WR));
                        }

                    } else if(Koop ==0 & Verkoop ==0) {
                        VR = Double.parseDouble(VR_Text.getText().toString());
                        AR = Double.parseDouble(AR_Text.getText().toString());
                        VG = Double.parseDouble(VG_Text.getText().toString());
                        AG = Double.parseDouble(AG_Text.getText().toString());
                        VK = Double.parseDouble(VK_Text.getText().toString())/1000;
                        WR = VR - AR - (VG-AG)*VK/VO;
                        WR_Text.setText(zeroprecision.format(WR));
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
                            WP = Math.round(((VR/(AR+(VG-AG)*VK/VO))-1)*100*100)/100.0;
                            AR_Text.setText(zeroprecision.format(AR));
                            AP_Text.setText(twoprecision.format(AP));
                            WP_Text.setText(twoprecision.format(WP));
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
                            WP = Math.round(((VR/(AR+(VG-AG)*VK/VO))-1)*100*100)/100.0;
                            VR_Text.setText(zeroprecision.format(VR));
                            VP_Text.setText(twoprecision.format(VP));
                            WP_Text.setText(twoprecision.format(WP));
                        }
                    } else if(Koop ==0 & Verkoop ==0) {
                        VR = Double.parseDouble(VR_Text.getText().toString());
                        AR = Double.parseDouble(AR_Text.getText().toString());
                        VG = Double.parseDouble(VG_Text.getText().toString());
                        AG = Double.parseDouble(AG_Text.getText().toString());
                        VK = Double.parseDouble(VK_Text.getText().toString())/1000;
                        WP = Math.round(((VR/(AR+(VG-AG)*VK/VO))-1)*100*100)/100.0;
                        WP_Text.setText(twoprecision.format(WP));
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
                        WP = Math.round(((VR/(AR+(VG-AG)*VK/VO))-1)*100*100)/100.0;
                        WR = VR - AR - (VG-AG)*VK/VO;
                        WP_Text.setText(twoprecision.format(WP));
                        WR_Text.setText(zeroprecision.format(WR));

                    } else {
                        Toast.makeText(getApplicationContext(),"Onvolledige inlighting",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
        }
    }
}