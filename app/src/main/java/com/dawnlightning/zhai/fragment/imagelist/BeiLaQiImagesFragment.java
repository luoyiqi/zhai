package com.dawnlightning.zhai.fragment.imagelist;

import android.os.Bundle;

import com.dawnlightning.zhai.adapter.imagelistadapter.BeiLaQiImageListAdapter;
import com.dawnlightning.zhai.base.Actions;
import com.dawnlightning.zhai.bean.ImageListBean;
import com.dawnlightning.zhai.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/9.
 */
public class BeiLaQiImagesFragment extends BaseFragment {
    private List<ImageListBean> imageListBeanList =new ArrayList<>();
    public  static BeiLaQiImagesFragment newInstance(Bundle data) {
        BeiLaQiImagesFragment beautifyLegImagesFragement =new BeiLaQiImagesFragment();
        beautifyLegImagesFragement.setArguments(data);
        return beautifyLegImagesFragement;
    }
    @Override
    public void initAdapter() {
        adapter= new BeiLaQiImageListAdapter(getActivity());
        adapter.setList(imageListBeanList);
    }

    @Override
    public void Refresh(int page, Actions action) {
        imageListPresenter.loadBeiLaQiList(page,channel_id,action);
    }

    @Override
    public void LoadMore(int page, Actions action) {
        imageListPresenter.loadBeiLaQiList(page,channel_id,action);
    }

    @Override
    public void GoTo(int page, Actions action) {
        imageListPresenter.loadBeiLaQiList(page,channel_id,action);
    }
}
