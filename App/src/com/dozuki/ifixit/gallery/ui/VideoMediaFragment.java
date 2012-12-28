package com.dozuki.ifixit.gallery.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.dozuki.ifixit.R;
import com.dozuki.ifixit.gallery.model.UserVideoList;

public class VideoMediaFragment extends SherlockFragment implements MediaFragment{
	private GridView mGridView;
	private MediaAdapter mGalleryAdapter;
	public TextView noVideoText;
	private static UserVideoList mVideoList;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		mVideoList = new UserVideoList();
		mGalleryAdapter = new MediaAdapter();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.gallery_view, container, false);

		noVideoText = ((TextView) view.findViewById(R.id.no_images_text));
		noVideoText.setText(R.string.no_videos_text);
		if (mVideoList.getVideos().size() < 1) {
			noVideoText.setVisibility(View.VISIBLE);
		} else {
			noVideoText.setVisibility(View.GONE);
		}

		mGridView = (GridView) view.findViewById(R.id.gridview);
		//mGridView.setOnScrollListener(new GalleryOnScrollListener());

		mGridView.setAdapter(mGalleryAdapter);
		//mGridView.setOnItemClickListener(this);
		//mGridView.setOnItemLongClickListener(this);

	//	mButtons = (RelativeLayout) view.findViewById(R.id.button_holder);
		//mLoginText = ((TextView) view.findViewById(R.id.login_text));

	//	if (mSelectedList.contains(true)) {
		//	setDeleteMode();
		//}
		return view;
	}
	
	private class MediaAdapter extends BaseAdapter {
		@Override
		public long getItemId(int id) {
			return id;
		}

		@Override
		public int getCount() {
			return mVideoList.getVideos().size();
		}

		@Override
		public Object getItem(int arg0) {
			return null;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			return null;
		}
	}
	
	@Override
	public void launchCamera() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void launchGallery() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearMediaList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrieveUserMedia() {
		// TODO Auto-generated method stub
		
	}

}
