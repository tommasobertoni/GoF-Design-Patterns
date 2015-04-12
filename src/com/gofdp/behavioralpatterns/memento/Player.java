package com.gofdp.behavioralpatterns.memento;

import java.util.LinkedList;
import java.util.List;

public class Player {

	private Game _game;
	private List<Items> _items;
	private String _name;
	private PlayerMemento _lastMemento;
	
	public Player(Game game, String playerName) {
		_game = game;
		_name = playerName;
		_items = new LinkedList<>();
	}
	
	public void rename(String playerName) {
		_name = playerName;
	}
	
	public String getName() {
		return _name;
	}
	
	public List<Items> getItems() {
		return _items;
	}
	
	public void pickItem(Items item) {
		Items itemFound = _game.pickItem(item);
		if (itemFound != null)
			_items.add(itemFound);
	}
	
	public void addItem(Items item) {
		_items.add(item);
	}
	
	public void removeItem(Items item) {
		_items.remove(item);
	}
	
	public PlayerMemento createMemento() {
		_lastMemento = new PlayerMemento();
		return _lastMemento;
	}
	
	public void restoreState(PlayerMemento memento) {
		memento.restoreState();
		_lastMemento = memento;
	}
	
	public void restoreState() {
		if (_lastMemento != null)
			_lastMemento.restoreState();
	}
	
	public class PlayerMemento {
		
		private List<Items> _itemsMemento;
		private String _nameMemento;
		
		public PlayerMemento() {
			_itemsMemento = new LinkedList<>();
			_itemsMemento.addAll(Player.this._items);
			_nameMemento = Player.this._name;
		}
		
		private void restoreState() {
			Player.this._items.clear();
			Player.this._items.addAll(_itemsMemento);
			Player.this._name = _nameMemento;
		}
	}
}
