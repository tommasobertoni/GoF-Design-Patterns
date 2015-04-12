package com.gofdp.behavioralpatterns.memento;

import java.util.LinkedList;
import java.util.List;

import com.gofdp.behavioralpatterns.memento.Player.PlayerMemento;

public class Game {

	private int _roomNumber;
	private Player _player;
	private List<Items> _availableItems;
	
	public Game(String playerName) {
		_availableItems = new LinkedList<>();
		_player = new Player(this, playerName);
		
		if (GameSaves.instance.saves.size() > 0)
			GameSaves.instance.saves.get(GameSaves.instance.saves.size() - 1).restoreState();
		else setRoomItems();
	}
	
	public void setRoom(int roomNumber) {
		
		if (roomNumber > 0 && roomNumber <= 5) {
			_roomNumber = roomNumber;
			setRoomItems();
		}
	}
	
	public Player getPlayer() {
		return _player;
	}
	
	public List<Items> getItems() {
		return _availableItems;
	}
	
	public Items pickItem(Items item) {
		return _availableItems.contains(item) ? item : null;
	}
	
	private void setRoomItems() {
		_availableItems.clear();
		switch (_roomNumber) {
		case 0:
			_availableItems.add(Items.BACKPACK);
			break;
			
		case 1:
			_availableItems.add(Items.TORCH);
			_availableItems.add(Items.SHOVEL);
			break;
			
		case 2:
			_availableItems.add(Items.PICKAXE);
			_availableItems.add(Items.COMPASS);
			break;
			
		case 3:
			_availableItems.add(Items.GEM);
			break;
			
		case 4:
			_availableItems.add(Items.SCREWDRIVER);
			_availableItems.add(Items.TRAP);
			break;
			
		case 5:
			_availableItems.add(Items.MAP);
			break;
		}
	}
	
	public void saveGame() {
		GameSaves.instance.saves.add(new GameMemento());
	}
	
	public void load(int saveIndex) {
		GameSaves.instance.saves.get(saveIndex).restoreState();
	}
	
	public class GameMemento {
		
		private int _roomNumberMemento;
		private PlayerMemento _playerMemento;
		
		public GameMemento() {
			_roomNumberMemento = Game.this._roomNumber;
			_playerMemento = Game.this._player.createMemento();
		}
		
		private void restoreState() {
			Game.this._roomNumber = _roomNumberMemento;
			Game.this._player.restoreState(_playerMemento);
			Game.this.setRoomItems();
		}
	}
}
