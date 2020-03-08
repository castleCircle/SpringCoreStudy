package me.wony.PropertyEditor;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        //Value는 프로퍼티 데이터가 가지고 있는값인데 서로 다른 쓰레드에게 공유가 된다.
        //상태정보를 저장하고 있다. => Thread safe 하지 않다.
        //=> 그냥 bean으로 등록하면 안된다.
        //thread scope으로 그나마 괜찮다.
        //전혀 빈으로 등록 안한느것을 추천한다.
        Event event = (Event)getValue();
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }
}
