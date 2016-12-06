package com.gmail.bones03052.pathfinder.gui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.gmail.bones03052.pathfinder.settlement.Settlement;

/**
 * Created by Greg Hadjiyane on 12/6/2016.
 */

public class SettlementList {

    /**
     * An array of sample settlements
     */
    public static final List<SettlementItem> ITEMS = new ArrayList<SettlementItem>();

    /**
     * A map of settlement items, by ID.
     */
    public static final Map<String, SettlementItem> ITEM_MAP = new HashMap<String, SettlementItem>();

    static {
        // Add a starting settlement
        addItem(createSettlementItem(1));
    }

    private static void addItem(SettlementItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static SettlementItem createSettlementItem(int position) {
        return new SettlementItem(String.valueOf(position), "Settlement " + position);
    }


    /**
     * An item representing a settlement
     */
    public static class SettlementItem {
        public final String id;
        public final String content;

        public SettlementItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }

}
