package com.miramicodigo.studyjam_ii_views_ii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private TextView Numero2;
    private int can1=0;
    private int can2;
    private int res;
    private double res2;
    private int ope=0;
    private int sw=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        resultado = (TextView) findViewById(R.id.tvResultado);

    }
    public void escribir1(View w){
        if(sw==1){
            can1=0;
            sw=0;
            res = can1 * 10+1;
            resultado.setText(res+"");
        }
        else{
            can1 = Integer.parseInt(resultado.getText().toString());
            res = can1 * 10+1;
            resultado.setText(res+"");
        }
    }
    public  void escribir2(View w){
        if(sw==1){
            can1=0;
            sw=0;
            res = can1 * 10+2;
            resultado.setText(res+"");
        }
        else{
            can1 = Integer.parseInt(resultado.getText().toString());
            res = can1 * 10+2;
            resultado.setText(res+"");
        }
    }
    public  void escribir3(View w){
        if(sw==1){
            can1=0;
            sw=0;
            res = can1 * 10+3;
            resultado.setText(res+"");
        }
        else{
            can1 = Integer.parseInt(resultado.getText().toString());
            res = can1 * 10+3;
            resultado.setText(res+"");
        }
    }
    public  void escribir4(View w){
        if(sw==1){
            can1=0;
            sw=0;
            res = can1 * 10+4;
            resultado.setText(res+"");
        }
        else{
            can1 = Integer.parseInt(resultado.getText().toString());
            res = can1 * 10+4;
            resultado.setText(res+"");
        }
    }
    public  void escribir5(View w){
        if(sw==1){
            can1=0;
            sw=0;
            res = can1 * 10+5;
            resultado.setText(res+"");
        }
        else{
            can1 = Integer.parseInt(resultado.getText().toString());
            res = can1 * 10+5;
            resultado.setText(res+"");
        }
    }
    public  void escribir6(View w){
        if(sw==1){
            can1=0;
            sw=0;
            res = can1 * 10+6;
            resultado.setText(res+"");
        }
        else{
            can1 = Integer.parseInt(resultado.getText().toString());
            res = can1 * 10+6;
            resultado.setText(res+"");
        }
    }
    public  void escribir7(View w){
        if(sw==1){
            can1=0;
            sw=0;
            res = can1 * 10+7;
            resultado.setText(res+"");
        }
        else{
            can1 = Integer.parseInt(resultado.getText().toString());
            res = can1 * 10+7;
            resultado.setText(res+"");
        }
    }
    public  void escribir8(View w){
        if(sw==1){
            can1=0;
            sw=0;
            res = can1 * 10+8;
            resultado.setText(res+"");
        }
        else{
            can1 = Integer.parseInt(resultado.getText().toString());
            res = can1 * 10+8;
            resultado.setText(res+"");
        }
    }
    public  void escribir9(View w){
        if(sw==1){
            can1=0;
            sw=0;
            res = can1 * 10+9;
            resultado.setText(res+"");
        }
        else{
            can1 = Integer.parseInt(resultado.getText().toString());
            res = can1 * 10+9;
            resultado.setText(res+"");
        }
    }
    public  void escribir0(View w){
        if(sw==1){
            can1=0;
            sw=0;
            res = can1 * 10;
            resultado.setText(res+"");
        }else{
            can1 = Integer.parseInt(resultado.getText().toString());
            res = can1 * 10;
            resultado.setText(res+"");
        }
    }
    public void borra(View w){
        res = 0;
        can1=0;
        can2=0;
        resultado.setText(res+"");
    }
    public void suma(View v){
        if(can2>0){
            if(ope==1){
                can1 = Integer.parseInt(resultado.getText().toString());
                res = can1 + can2;
                resultado.setText(res+"");
            }else{
                if(ope==2){
                    can1 = Integer.parseInt(resultado.getText().toString());
                    res = can2 - can1;
                    resultado.setText(res+"");
                }else{
                    if(ope==3){
                        can1 = Integer.parseInt(resultado.getText().toString());
                        res = can1 * can2;
                        resultado.setText(res+"");
                    }else{
                        if(ope==4){
                            can1 = Integer.parseInt(resultado.getText().toString());
                            res2 = can1 / can2;
                            resultado.setText(res+"");
                        }
                    }
                }
            }
        }
        sw=1;
        can2 = Integer.parseInt(resultado.getText().toString());
        ope=1;
    }
    public void resta(View v){
        if(can2>0){
            if(ope==1){
                can1 = Integer.parseInt(resultado.getText().toString());
                res = can1 + can2;
                resultado.setText(res+"");
            }else{
                if(ope==2){
                    can1 = Integer.parseInt(resultado.getText().toString());
                    res = can2 - can1;
                    resultado.setText(res+"");
                }else{
                    if(ope==3){
                        can1 = Integer.parseInt(resultado.getText().toString());
                        res = can1 * can2;
                        resultado.setText(res+"");
                    }else{
                        if(ope==4){
                            can1 = Integer.parseInt(resultado.getText().toString());
                            res2 = can1 / can2;
                            resultado.setText(res+"");
                        }
                    }
                }
            }
        }
        sw=1;
        can2 = Integer.parseInt(resultado.getText().toString());
        ope=2;
    }
    public void multi(View v){
        if(can2>0){
            if(ope==1){
                can1 = Integer.parseInt(resultado.getText().toString());
                res = can1 + can2;
                resultado.setText(res+"");
            }else{
                if(ope==2){
                    can1 = Integer.parseInt(resultado.getText().toString());
                    res = can2 - can1;
                    resultado.setText(res+"");
                }else{
                    if(ope==3){
                        can1 = Integer.parseInt(resultado.getText().toString());
                        res = can1 * can2;
                        resultado.setText(res+"");
                    }else{
                        if(ope==4){
                            can1 = Integer.parseInt(resultado.getText().toString());
                            res2 = can1 / can2;
                            resultado.setText(res+"");
                        }
                    }
                }
            }
        }
        can2 = Integer.parseInt(resultado.getText().toString());
        ope=3;
        sw=1;
    }
    public void divi(View v){
        if(can2>0){
            if(ope==1){
                can1 = Integer.parseInt(resultado.getText().toString());
                res = can1 + can2;
                resultado.setText(res+"");
            }else{
                if(ope==2){
                    can1 = Integer.parseInt(resultado.getText().toString());
                    res = can2 - can1;
                    resultado.setText(res+"");
                }else{
                    if(ope==3){
                        can1 = Integer.parseInt(resultado.getText().toString());
                        res = can1 * can2;
                        resultado.setText(res+"");
                    }else{
                        if(ope==4){
                            can1 = Integer.parseInt(resultado.getText().toString());
                            res2 = can2 / can1;
                            resultado.setText(res2+"");
                        }
                    }
                }
            }
        }
        can2 = Integer.parseInt(resultado.getText().toString());
        ope=4;
        sw=1;
    }
    public void igual(View w){
        if(ope==1){
            can1 = Integer.parseInt(resultado.getText().toString());
            res = can1 + can2;
            resultado.setText(res+"");
        }else{
            if(ope==2){
                can1 = Integer.parseInt(resultado.getText().toString());
                res = can2 - can1;
                resultado.setText(res+"");
            }else{
                if(ope==3){
                    can1 = Integer.parseInt(resultado.getText().toString());
                    res = can1 * can2;
                    resultado.setText(res+"");
                }else{
                    if(ope==4){
                        can1 = Integer.parseInt(resultado.getText().toString());
                        res2 = can2 / can1;
                        resultado.setText(res2+"");
                    }else{
                        res = 0;
                        resultado.setText(res+"");
                    }
                }
            }
        }
        sw=1;
        ope=0;
    }
}
