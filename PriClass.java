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
//DWORD dwSize; // �ṹ��С��
//DWORD cntUsage; // �˽��̵����ü�����ͨ��Ϊ0��
//DWORD th32ProcessID; // ����ID;
//DWORD th32DefaultHeapID; // ����Ĭ�϶�ID��ͨ��Ϊ0��
//DWORD th32ModuleID; // ����ģ��ID��ͨ��Ϊ0��
//DWORD cntThreads; // �˽��̿������̼߳�����
//DWORD th32ParentProcessID;// ������ID��
//LONG pcPriClassBase; // �߳�����Ȩ�����ڵ�ǰ�����ڴ����̵߳Ļ�����������ȼ���ֵ��
//DWORD dwFlags; // ������ͨ��Ϊ0��
//WCHAR szExeFile[MAX_PATH]; // ����ȫ�������ǣ���������ý�����һ��64λ�������������QueryFullProcessImageName����ȥ��ȡ64λ���̵Ŀ�ִ���ļ�����·����������
//} PROCESSENTRY32;
