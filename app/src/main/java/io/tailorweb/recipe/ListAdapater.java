package io.tailorweb.recipe;

public class ListAdapater extends RecyclerAdapter {

    private final ListFragment.OnRecipeSelectedInterface mListener;

    public ListAdapater(ListFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }

    @Override
    public int getLayoutId() {
        return R.layout.list_item;
    }

    @Override
    protected void onRecipeSelected(int index) {
        mListener.onListRecipeSelected(index);
    }

}
