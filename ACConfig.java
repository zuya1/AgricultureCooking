package AgricultureCooking;

public final class ACConfig {


	private int baseId;

	private int nowId;

	public ACConfig(int baseId) {
		this.baseId = baseId;
		this.nowId = baseId;
	}

	public int getId() {
		return nowId++;
	}

	public int getId_NoAdd() {
		return nowId;
	}

	public int getBaseId() {
		return baseId;
	}

}

