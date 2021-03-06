package joshie.progression.criteria.triggers.data;

import joshie.progression.api.ITriggerData;
import net.minecraft.nbt.NBTTagCompound;

public class DataCount implements ITriggerData {
	public int count = 0;

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		count = tag.getInteger("Count");
	}

	@Override
	public void writeToNBT(NBTTagCompound tag) {
		tag.setInteger("Count", count);
	}
}
