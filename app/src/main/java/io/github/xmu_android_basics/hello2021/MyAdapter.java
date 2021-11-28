package io.github.xmu_android_basics.hello2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import io.github.xmu_android_basics.hello2021.databinding.ListItemBinding;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ItemViewHolder> {

    private List<String> stringList;

    public MyAdapter(String[] data) {
        stringList = Arrays.asList(data);
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ListItemBinding binding = ListItemBinding.inflate(inflater, parent, false);

        return new ItemViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        String item = stringList.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public void setData(String[] data) {
        stringList = Arrays.asList(data);

        notifyDataSetChanged();
    }

    protected class ItemViewHolder extends RecyclerView.ViewHolder {
        private ListItemBinding _binding;

        ItemViewHolder(ListItemBinding binding) {
            super(binding.getRoot());
            _binding = binding;
        }

        void bind(String item) {
            _binding.itemString.setText(item);
        }
    }
}
