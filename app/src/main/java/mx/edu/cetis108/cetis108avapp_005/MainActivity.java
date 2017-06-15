package mx.edu.cetis108.cetis108avapp_005;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button temas;
    Button nuevo;
    Button ayuda;
    Button registro;
    Button iniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temas =(Button)findViewById(R.id.btn1);
        nuevo =(Button)findViewById(R.id.btn2);
        ayuda =(Button)findViewById(R.id.btn3);
        registro =(Button)findViewById(R.id.btn4);
        iniciar=(Button)findViewById(R.id.btn5);

        temas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temas = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(temas);
            }
        });
        nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevo = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(nuevo);
            }
        });
        ayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ayuda = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(ayuda);
            }
        });

    }
}
