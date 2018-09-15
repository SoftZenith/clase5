package mx.edu.ittepic.clase5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lsvLista;

    String [] lista = {"Italia", "México", "Rusia", "EUA", "Alemania", "Puerto Rico" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsvLista = findViewById(R.id.lsvLista);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item , lista);

        lsvLista.setAdapter(adaptador);

        lsvLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String elemento = lista[position];
                //llenar intent
                //Mandar llamar pantalla
            }
        });

        //POO

        //Crear cliente
        Cliente pedro = new Cliente("Pedro","Centro",24);
        String nombre = pedro.getNombre();
        pedro.setNombre("Pedro Luis");

        Cliente luis = new Cliente();

    }
}
