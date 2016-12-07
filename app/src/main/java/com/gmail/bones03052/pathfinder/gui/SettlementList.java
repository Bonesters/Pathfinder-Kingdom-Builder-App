package com.gmail.bones03052.pathfinder.gui;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Greg Hadjiyane on 12/6/2016.
 */

public class SettlementList {

    /**
     * An array of sample settlements
     */
    public static final List<SettlementItem> ITEMS = new ArrayList<SettlementItem>();

    static {
        // Add a starting settlement
        addItem(createSettlementItem(1));
    }

    private static void addItem(SettlementItem item) {
        ITEMS.add(item);
    }

    private static SettlementItem createSettlementItem(int position) {
        return new SettlementItem(position, "Settlement " + position);
    }


    /**
     * An item representing a settlement
     */
    public static class SettlementItem {
        public final int id;
        public final String content;

        public SettlementItem(int id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }

}
