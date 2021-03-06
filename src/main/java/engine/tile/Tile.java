package engine.tile;

import java.util.Random;

public class Tile implements ITile {

	private static final String[] Rlist = {"Iron", "Copper", "Gold"};
	private int type;
	private String resource;
	private int resAmount;
	private int sprite;
	private boolean solid;
	private TileContext curTile;


	public int RRAmmout() {
		Random rand = new Random();
		int n = rand.nextInt(2) + 1;
		return n;
	}

	public Tile(int type) {
		this.type = type;
		if (type == 3) {
			this.resource = Rlist[RRAmmout()];
			this.resAmount = RRAmmout();
		} else {
			this.resource = "";
			this.resAmount = 0;
		}
	}

	public Tile(int type, int sprite, boolean solid) {
		this.type = type;
		this.sprite = sprite;
		this.solid = solid;
	}
	
	public boolean isSolid() {
		return this.solid;
	}
	
	public int getType() {
        return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getResource() {
        return this.resource;
	}

	public void setResource() {
		this.resource = "";
	}

	public int getRRammount() {
        return this.resAmount;
	}

	public void setRRammount() {
		this.resAmount = 0;
	}
	
	public int getSprite() {
		return this.sprite;
	}
	
	public void setSprite(int sprite) {
		this.sprite = sprite;
	}
	
	public void setSolid(boolean solid) {
		this.solid = solid;
	}
	
	public void pop(TileContext ctx) {
		this.curTile = ctx;
	}

	public String toString() {
		String str;
		if (this.type == 1) str = "space tile";
		else if (this.type == 2) str = "asteroid tile";
		else if (this.type == 3) str = "resource tile";
		else if (this.type == 4) str = "ship tile";
		else if (this.type == 5) str = "shop tile";
        else str = "blank tile";
		return str;
	}

}
