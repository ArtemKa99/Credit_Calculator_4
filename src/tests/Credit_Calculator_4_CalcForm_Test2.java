package tests;

/* ����������� ���������� JUnit, ����������� ��������� ����� ��� �������� */
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import calculator.Credit_Calculator_4_CalcForm;

/* �������� ������, ����������� ��� ����� */
public class Credit_Calculator_4_CalcForm_Test2 {
    
	/* ��������� @Test ��������� JUnit, ��� � ������ ��������� ��� ����� */
    @Test
    public void testCalculator(){
		/* ��������� ���������� �� ������ ������������� ������ � �������� ���������� ����� */
			/* �������� ������� ������, ����������� ��������� */
    	Credit_Calculator_4_CalcForm lc = new Credit_Calculator_4_CalcForm();
			/* ���������� ���� ����� ��������� ������������ ������������������� �������� */
            lc.vvod.setText("12");
            lc.vvod1.setText("12");
            lc.vvod2.setText("10");
			/* ������ ��������� */
            lc.Credit_Calculator_4_CalcForm1();
			/* ��������� ����������, ����������� ����������, � ��������� ��������� */
            Assert.assertTrue("12.65".equals(lc.vuvod.getText()));
		/* ���, ����������� ��� ������������� ������ � �������� ���������� ����� */
    }
}