package lat.pam.uts_pizza;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import lat.pam.uts_pizza.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.burger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.burger_order_message));
            }
        });

        view.findViewById(R.id.pizza).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.pizza_order_message));
            }
        });

        view.findViewById(R.id.steak).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.steak_order_message));
            }
        });

        view.findViewById(R.id.spaghetti).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.spaghetti_order_message));
            }
        });
    }

    public void displayToast(String message) {
        Toast.makeText(getActivity(), message,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}