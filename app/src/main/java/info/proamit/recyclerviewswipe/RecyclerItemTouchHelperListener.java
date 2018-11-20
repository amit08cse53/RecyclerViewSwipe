package info.proamit.recyclerviewswipe;

import android.support.v7.widget.RecyclerView;

public interface RecyclerItemTouchHelperListener {
        void onSwiped(RecyclerView.ViewHolder viewHolder, int direction, int position);
    }