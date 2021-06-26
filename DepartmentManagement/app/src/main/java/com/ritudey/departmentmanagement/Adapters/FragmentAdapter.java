package com.ritudey.departmentmanagement.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ritudey.departmentmanagement.Fragments.AttendanceFragment;
import com.ritudey.departmentmanagement.Fragments.DepartmentFragment;
import com.ritudey.departmentmanagement.Fragments.LibraryFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull  Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull

    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 1:
                return new AttendanceFragment();
            case 2:
                return new LibraryFragment();
        }

        return new DepartmentFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
