package com.gmail.restujulian07.restuapp;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
public class JadwalAdapter extends RecyclerView.Adapter<JadwalAdapter.JadwalViewHolder> {


    private ArrayList<Jadwal> dataList;

    public JadwalAdapter(ArrayList<Jadwal> dataList) {
        this.dataList = dataList;
    }

    @Override
    public JadwalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_jadwal, parent, false);
        return new JadwalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(JadwalViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtTgl.setText(dataList.get(position).getTgl());
        holder.txtKet.setText(dataList.get(position).getKet());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class JadwalViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtTgl, txtKet;

        public JadwalViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtTgl = (TextView) itemView.findViewById(R.id.txt_tgl);
            txtKet = (TextView) itemView.findViewById(R.id.txt_ket);
        }
    }
}
