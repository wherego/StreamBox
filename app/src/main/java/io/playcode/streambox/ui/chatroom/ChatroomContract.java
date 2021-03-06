package io.playcode.streambox.ui.chatroom;

import java.util.List;

import io.playcode.streambox.ui.base.BasePresenter;
import io.playcode.streambox.ui.base.BaseView;

/**
 * Created by anpoz on 2017/4/15.
 */

public interface ChatroomContract {
    interface Presenter extends BasePresenter {

    }

    interface View extends BaseView<Presenter> {
        void addDanmu();
        void addCommit(List<CharSequence> charSequenceList);
    }
}
