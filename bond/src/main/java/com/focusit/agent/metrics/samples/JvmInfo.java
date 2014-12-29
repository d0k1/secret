package com.focusit.agent.metrics.samples;

import io.netty.buffer.ByteBuf;

import java.nio.ByteBuffer;

/**
 * Class to hold JVM metrics sample
 * <p/>
 * Created by Denis V. Kirpichenkov on 08.12.14.
 */
public final class JvmInfo implements Sample<JvmInfo> {

	public static int sizeOf() {
		// 8 byte per field * 24 fields
		return 8 * 27;
	}

	public long ipv4Addr1 = -1;
	public long ipv4Addr2 = -1;
	public long ipv4Addr3 = -1;
	public long ipv4Addr4 = -1;
	public long pid;
	public long loadedClassCount;
	public long heapCommited;
	public long heapInit;
	public long heapMax;
	public long heapUsed;
	public double processCpuLoad;
	public double systemCpuLoad;
	public long freePhysMem;
	public long freeSwap;
	public long totalPhysMem;
	public long totalSwap;
	public long threadCount;
	public long threadDaemonCount;
	public long peakThreadCount;
	public long totalStartedThreadCount;
	public long lastTimeGc1;
	public long lastTimeGc2;
	public long totalCountGc1;
	public long totalCountGc2;
	public long time;
	public long timestamp;
	public long appId;

	@Override
	public Sample<JvmInfo> copyDataFrom(Sample<JvmInfo> sample) {
		JvmInfo in = (JvmInfo) sample;

		ipv4Addr1 = in.ipv4Addr1;
		ipv4Addr2 = in.ipv4Addr2;
		ipv4Addr3 = in.ipv4Addr3;
		ipv4Addr4 = in.ipv4Addr4;
		pid = in.pid;
		loadedClassCount = in.loadedClassCount;
		heapCommited = in.heapCommited;
		heapInit = in.heapInit;
		heapMax = in.heapMax;
		heapUsed = in.heapUsed;
		freePhysMem = in.freePhysMem;
		freeSwap = in.freeSwap;
		totalPhysMem = in.totalPhysMem;
		totalSwap = in.totalSwap;
		threadCount = in.threadCount;
		threadDaemonCount = in.threadDaemonCount;
		peakThreadCount = in.peakThreadCount;
		totalStartedThreadCount = in.totalStartedThreadCount;
		lastTimeGc1 = in.lastTimeGc1;
		lastTimeGc2 = in.lastTimeGc2;
		totalCountGc1 = in.totalCountGc1;
		totalCountGc2 = in.totalCountGc2;

		processCpuLoad = in.processCpuLoad;
		systemCpuLoad = in.systemCpuLoad;
		time = in.time;
		timestamp = in.timestamp;
		appId = in.appId;
		return this;
	}

	@Override
	public void writeToBuffer(ByteBuffer out) {
		out.putLong(ipv4Addr1);
		out.putLong(ipv4Addr2);
		out.putLong(ipv4Addr3);
		out.putLong(ipv4Addr4);
		out.putLong(pid);
		out.putLong(loadedClassCount);
		out.putLong(heapCommited);
		out.putLong(heapInit);
		out.putLong(heapMax);
		out.putLong(heapUsed);
		out.putLong(freePhysMem);
		out.putLong(freeSwap);
		out.putLong(totalPhysMem);
		out.putLong(totalSwap);
		out.putLong(threadCount);
		out.putLong(threadDaemonCount);
		out.putLong(peakThreadCount);
		out.putLong(totalStartedThreadCount);
		out.putLong(lastTimeGc1);
		out.putLong(lastTimeGc2);
		out.putLong(totalCountGc1);
		out.putLong(totalCountGc2);

		out.putLong(Double.doubleToLongBits(processCpuLoad));
		out.putLong(Double.doubleToLongBits(systemCpuLoad));
		out.putLong(time);
		out.putLong(timestamp);
		out.putLong(appId);
	}

	@Override
	public void readFromBuffer(ByteBuffer in) {
		ipv4Addr1 = in.getLong();
		ipv4Addr2 = in.getLong();
		ipv4Addr3 = in.getLong();
		ipv4Addr4 = in.getLong();
		pid = in.getLong();
		loadedClassCount = in.getLong();
		heapCommited = in.getLong();
		heapInit = in.getLong();
		heapMax = in.getLong();
		heapUsed = in.getLong();
		freePhysMem = in.getLong();
		freeSwap = in.getLong();
		totalPhysMem = in.getLong();
		totalSwap = in.getLong();
		threadCount = in.getLong();
		threadDaemonCount = in.getLong();
		peakThreadCount = in.getLong();
		totalStartedThreadCount = in.getLong();
		lastTimeGc1 = in.getLong();
		lastTimeGc2 = in.getLong();
		totalCountGc1 = in.getLong();
		totalCountGc2 = in.getLong();

		processCpuLoad = Double.longBitsToDouble(in.getLong());
		systemCpuLoad = Double.longBitsToDouble(in.getLong());
		time = in.getLong();
		timestamp = in.getLong();
		appId = in.getLong();
	}

	@Override
	public void writeToBuffer(ByteBuf out) {
		out.writeLong(ipv4Addr1);
		out.writeLong(ipv4Addr2);
		out.writeLong(ipv4Addr3);
		out.writeLong(ipv4Addr4);
		out.writeLong(pid);
		out.writeLong(loadedClassCount);
		out.writeLong(heapCommited);
		out.writeLong(heapInit);
		out.writeLong(heapMax);
		out.writeLong(heapUsed);
		out.writeLong(freePhysMem);
		out.writeLong(freeSwap);
		out.writeLong(totalPhysMem);
		out.writeLong(totalSwap);
		out.writeLong(threadCount);
		out.writeLong(threadDaemonCount);
		out.writeLong(peakThreadCount);
		out.writeLong(totalStartedThreadCount);
		out.writeLong(lastTimeGc1);
		out.writeLong(lastTimeGc2);
		out.writeLong(totalCountGc1);
		out.writeLong(totalCountGc2);

		out.writeLong(Double.doubleToLongBits(processCpuLoad));
		out.writeLong(Double.doubleToLongBits(systemCpuLoad));
		out.writeLong(time);
		out.writeLong(timestamp);
		out.writeLong(appId);
	}

	@Override
	public void readFromBuffer(ByteBuf in) {
		ipv4Addr1 = in.readLong();
		ipv4Addr2 = in.readLong();
		ipv4Addr3 = in.readLong();
		ipv4Addr4 = in.readLong();
		pid = in.readLong();
		loadedClassCount = in.readLong();
		heapCommited = in.readLong();
		heapInit = in.readLong();
		heapMax = in.readLong();
		heapUsed = in.readLong();
		freePhysMem = in.readLong();
		freeSwap = in.readLong();
		totalPhysMem = in.readLong();
		totalSwap = in.readLong();
		threadCount = in.readLong();
		threadDaemonCount = in.readLong();
		peakThreadCount = in.readLong();
		totalStartedThreadCount = in.readLong();
		lastTimeGc1 = in.readLong();
		lastTimeGc2 = in.readLong();
		totalCountGc1 = in.readLong();
		totalCountGc2 = in.readLong();

		processCpuLoad = Double.longBitsToDouble(in.readLong());
		systemCpuLoad = Double.longBitsToDouble(in.readLong());
		time = in.readLong();
		timestamp = in.readLong();
		appId = in.readLong();
	}

	@Override
	public void readFromBuffer(long[] buffer) {
		ipv4Addr1 = buffer[0];
		ipv4Addr2 = buffer[1];
		ipv4Addr3 = buffer[2];
		ipv4Addr4 = buffer[3];
		pid = buffer[4];
		loadedClassCount = buffer[5];
		heapCommited = buffer[6];
		heapInit = buffer[7];
		heapMax = buffer[8];
		heapUsed = buffer[9];
		freePhysMem = buffer[10];
		freeSwap = buffer[11];
		totalPhysMem = buffer[12];
		totalSwap = buffer[13];
		threadCount = buffer[14];
		threadDaemonCount = buffer[15];
		peakThreadCount = buffer[16];
		totalStartedThreadCount = buffer[17];
		lastTimeGc1 = buffer[18];
		lastTimeGc2 = buffer[19];
		totalCountGc1 = buffer[20];
		totalCountGc2 = buffer[21];

		processCpuLoad = Double.longBitsToDouble(buffer[22]);
		systemCpuLoad = Double.longBitsToDouble(buffer[23]);

		time = buffer[24];
		timestamp = buffer[25];
		appId = buffer[26];
	}

	@Override
	public int sizeOfSample() {
		return JvmInfo.sizeOf();
	}

	@Override
	public String toString() {
		return "JvmInfo{" +
			"ipv4Addr1=" + ipv4Addr1 +
			", ipv4Addr2=" + ipv4Addr2 +
			", ipv4Addr3=" + ipv4Addr3 +
			", ipv4Addr4=" + ipv4Addr4 +
			", pid=" + pid +
			", loadedClassCount=" + loadedClassCount +
			", heapCommited=" + heapCommited +
			", heapInit=" + heapInit +
			", heapMax=" + heapMax +
			", heapUsed=" + heapUsed +
			", processCpuLoad=" + processCpuLoad +
			", systemCpuLoad=" + systemCpuLoad +
			", freePhysMem=" + freePhysMem +
			", freeSwap=" + freeSwap +
			", totalPhysMem=" + totalPhysMem +
			", totalSwap=" + totalSwap +
			", threadCount=" + threadCount +
			", threadDaemonCount=" + threadDaemonCount +
			", peakThreadCount=" + peakThreadCount +
			", totalStartedThreadCount=" + totalStartedThreadCount +
			", lastTimeGc1=" + lastTimeGc1 +
			", lastTimeGc2=" + lastTimeGc2 +
			", totalCountGc1=" + totalCountGc1 +
			", totalCountGc2=" + totalCountGc2 +
			", time=" + time +
			", timestamp=" + timestamp +
			", appId=" + appId +
			'}';
	}
}
