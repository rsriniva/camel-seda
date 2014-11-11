package com.buildria.camel.examle.seda;

import com.buildria.camelexample.seda.model.Book;
import org.apache.camel.component.dataset.DataSetSupport;

public class BookDataSet extends DataSetSupport {

    @Override
    protected Object createMessageBody(long messageIndex) {
        String no = String.format("%05d", messageIndex);
        return  new Book((int) messageIndex, "title: " + no, "author: " + no);
    }

}
