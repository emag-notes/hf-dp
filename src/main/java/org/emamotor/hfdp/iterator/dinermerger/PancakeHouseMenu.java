package org.emamotor.hfdp.iterator.dinermerger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author emag
 */
public class PancakeHouseMenu implements Menu {

    private List<MenuItem> _menuItems;

    public PancakeHouseMenu() {
        _menuItems = new ArrayList<>();

        addItem("K&B のパンケーキ朝食",
                "スクランブルエッグとトーストが付いたパンケーキ",
                true,
                2.99);

        addItem("通常のパンケーキ朝食",
                "卵焼きとソーセージが付いたパンケーキ",
                false,
                2.99);

        addItem("ブルーベリーパンケーキ",
                "新鮮なブルーベリーで作ったパンケーキ",
                true,
                3.49);

        addItem("ワッフル",
                "ブルーベリーか苺の好きな方をのせたワッフル",
                true,
                3.59);
    }

    private void addItem(String name,
                         String description,
                         boolean vegetarian,
                         double price) {

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        _menuItems.add(menuItem);

    }

    public List<MenuItem> getMenuItems() {
        return _menuItems;
    }

    @Override
    public String toString() {
        return "オブジェクト村パンケーキハウスメニュー";
    }

    // 他の List に依存したメニューメソッド

}
