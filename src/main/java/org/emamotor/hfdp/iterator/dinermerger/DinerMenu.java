package org.emamotor.hfdp.iterator.dinermerger;

/**
 * @author emag
 */
public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    private MenuItem[] _menuItems;


    public DinerMenu() {
        _menuItems = new MenuItem[MAX_ITEMS];

        addItem("ベジタリアンBLT",
                "レタス、トマト、(偽)ベーコンをはさんだ全粒小麦パンサンドイッチ",
                true,
                2.99);

        addItem("BLT",
                "レタス、トマト、ベーコンをはさんだ全粒小麦パンサンドイッチ",
                false,
                2.99);

        addItem("本日のスープ",
                "ポテトサラダを添えた本日のスープ",
                false,
                3.29);

        addItem("ホットドッグ",
                "サワークラフト、レリッシュ、玉ねぎ、チーズをはさんだホットドッグ",
                false,
                3.05);

        addItem("温野菜と玄米",
                "玄米の上に温野菜をのせて",
                true,
                3.99);

        addItem("パスタ",
                "サワードウパンを添えたマリナラソースのスパゲッティ",
                true,
                3.89);

    }

    private void addItem(String name,
                         String description,
                         boolean vegetarian,
                         double price) {

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("すみません、メニューはいっぱいです！ メニューに項目を追加できません。");
        } else {
            _menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }

    }

    public MenuItem[] getMenuItems() {
        return _menuItems;
    }

    @Override
    public String toString() {
        return "オブジェクト村食堂メニュー";
    }

    // 他の配列に依存したメニューメソッド
}
