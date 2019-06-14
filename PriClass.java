package me.tikiwong.PlantsVsZombies;

import com.sun.jna.Structure;

public class PriClass extends Structure{
	public int dwSize=1024;
	public int cntUsage;
	public int processId;
	public int th32DefaultHeapID;
	public int th32ModuleID;
	public int cntThreads;
	public int th32ParentProcessID;
	public int pcPriClassBase;
	public int dwFlags;
	public byte[] processName = new byte[256];

}
//typedef struct tagPROCESSENTRY32 {
//DWORD dwSize; // 结构大小；
//DWORD cntUsage; // 此进程的引用计数，通常为0；
//DWORD th32ProcessID; // 进程ID;
//DWORD th32DefaultHeapID; // 进程默认堆ID，通常为0；
//DWORD th32ModuleID; // 进程模块ID，通常为0；
//DWORD cntThreads; // 此进程开启的线程计数；
//DWORD th32ParentProcessID;// 父进程ID；
//LONG pcPriClassBase; // 线程优先权，即在当前进程内创建线程的话，其基本优先级的值；
//DWORD dwFlags; // 保留，通常为0；
//WCHAR szExeFile[MAX_PATH]; // 进程全名，但是，如果被调用进程是一个64位程序，您必须调用QueryFullProcessImageName函数去获取64位进程的可执行文件完整路径名。）；
//} PROCESSENTRY32;
