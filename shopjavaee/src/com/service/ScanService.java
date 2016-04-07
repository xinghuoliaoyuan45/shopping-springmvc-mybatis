package com.service;

import com.dao.ScanDao;
import com.entity.Scanbarcode;

public class ScanService
{
  private ScanDao scanDao;

  public ScanDao getScanDao()
  {
    return this.scanDao;
  }

  public void setScanDao(ScanDao scanDao) {
     this.scanDao = scanDao;
  }

  public void addScancode(Scanbarcode Scancode) throws Exception {
    this.scanDao.addScanbarcode(Scancode);
  }

  public void deleteScancode(String Scancode) throws Exception {
    this.scanDao.deleteScanbarcode(Scancode);
  }

  public Scanbarcode selectcancode(String scancode) throws Exception {
     Scanbarcode scan = this.scanDao.findScancode(scancode);
     return scan;
  }
}

