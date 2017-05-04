package org.apache.hadoop.hbase.regionserver;

public class HRegionMutateMetrics {
	private long getLockCostTime;
	private long writeMemstoreCostTime;
	private long syncWALCostTime;

	public long getGetLockCostTime() {
		return getLockCostTime;
	}

	public void setGetLockCostTime(long getLockCostTime) {
		this.getLockCostTime = getLockCostTime;
	}

	public long getWriteMemstoreCostTime() {
		return writeMemstoreCostTime;
	}

	public void setWriteMemstoreCostTime(long writeMemstoreCostTime) {
		this.writeMemstoreCostTime = writeMemstoreCostTime;
	}

	public long getSyncWALCostTime() {
		return syncWALCostTime;
	}

	public void setSyncWALCostTime(long syncWALCostTime) {
		this.syncWALCostTime = syncWALCostTime;
	}

	@Override
	public String toString() {
		return "HRegionMutateMetrics [getLockCostTime=" + getLockCostTime + ", writeMemstoreCostTime="
				+ writeMemstoreCostTime + ", syncWALCostTime=" + syncWALCostTime + "]";
	}

}
