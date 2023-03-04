package com.mozahidone.iterator;

import com.mozahidone.iterator.bst.BstIterator;
import com.mozahidone.iterator.bst.TreeNode;
import com.mozahidone.iterator.list.ItemType;
import com.mozahidone.iterator.list.TreasureChest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

  private static final TreasureChest TREASURE_CHEST = new TreasureChest();

  private static void demonstrateTreasureChestIteratorForType(ItemType itemType) {
    log.info("------------------------");
    log.info("Item Iterator for ItemType " + itemType + ": ");
    var itemIterator = TREASURE_CHEST.iterator(itemType);
    while (itemIterator.hasNext()) {
      log.info(itemIterator.next().toString());
    }
  }

  private static void demonstrateBstIterator() {
    log.info("------------------------");
    log.info("BST Iterator: ");
    var root = buildIntegerBst();
    var bstIterator = new BstIterator<>(root);
    while (bstIterator.hasNext()) {
      log.info("Next node: " + bstIterator.next().getVal());
    }
  }

  private static TreeNode<Integer> buildIntegerBst() {
    var root = new TreeNode<>(8);

    root.insert(3);
    root.insert(10);
    root.insert(1);
    root.insert(6);
    root.insert(14);
    root.insert(4);
    root.insert(7);
    root.insert(13);

    return root;
  }

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    demonstrateTreasureChestIteratorForType(ItemType.RING);
    demonstrateTreasureChestIteratorForType(ItemType.POTION);
    demonstrateTreasureChestIteratorForType(ItemType.WEAPON);
    demonstrateTreasureChestIteratorForType(ItemType.ANY);

    demonstrateBstIterator();
  }
}
