/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.FireBrigade.Alarming;

import com.FireBrigade.Firefighters.Firefighter;

import java.util.ArrayList;

/**
 *
 * @author retsu
 */
public class VFDUnit implements IVFDUnit {

    private ArrayList<Firefighter> firefighters = new ArrayList<>();

    String unitName;
    String testCode;
    String alarmCode;

    public VFDUnit(String unitName, String testCode, String alarmCode) {
        this.unitName = unitName;
        this.testCode = testCode;
        this.alarmCode = alarmCode;
    }


    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getTestCode() {
        return testCode;
    }

    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

    public String getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode;
    }

    public void add(Firefighter firefighter)
    {
        this.firefighters.add(firefighter);
    }

    @Override
    public ResponseCode notify(String CCIR_CODE) {
        if(CCIR_CODE == alarmCode)
        {
            for(Firefighter f: firefighters){
                f.sendSms(CCIR_CODE);
            }
            return ResponseCode.ALARM_OK;
        }
        else if(CCIR_CODE == testCode)
            return ResponseCode.TEST_OK;
        return ResponseCode.ERROR;
    }

}
