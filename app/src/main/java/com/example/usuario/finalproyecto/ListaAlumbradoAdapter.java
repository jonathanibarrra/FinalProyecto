package com.example.usuario.finalproyecto;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.usuario.finalproyecto.models.Alumbrado;

import java.util.ArrayList;

public class ListaAlumbradoAdapter extends RecyclerView.Adapter<ListaAlumbradoAdapter.ViewHolder> {
    private ArrayList<Alumbrado> dataset;

    private Context context;

    public ListaAlumbradoAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_lista_alumbrado_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Alumbrado c = dataset.get(position);
        holder.clase.setText(c.getEstrato());
        holder.numero.setText(c.getTarifaMensual());
        holder.oficial.setText(c.getUsuario());


    }

    @Override
    public int getItemCount() {

        return dataset.size();
    }

    public void adicionarListaAlumbrado(ArrayList<Alumbrado> listaAlumbrado) {
        dataset.addAll(listaAlumbrado);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView clase;
        private TextView numero;
        private TextView oficial;


        public ViewHolder(View itemView) {
            super(itemView);


            clase = (TextView) itemView.findViewById(R.id.clase);
            numero= (TextView) itemView.findViewById(R.id.numero);
            oficial=(TextView) itemView.findViewById(R.id.oficial);

        }
    }
}
