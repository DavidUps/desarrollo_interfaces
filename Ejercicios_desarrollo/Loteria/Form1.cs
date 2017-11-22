using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Loteria
{
    public partial class Form1 : Form
    {
        CheckBox[] checkbox = new CheckBox[15];

        public void activarLoteria()
        {
            activar10.Enabled = true;
            activar11.Enabled = true;
            activar12.Enabled = true;
            activar15.Enabled = true;
            dia.Enabled = true;
            validar.Enabled = true;
            reintegro.Enabled = true;
            manual.Enabled = true;
            automatico.Enabled = true;
            activarCheck();
        }

        public void activarCheck()
        {
            checkBox1.Enabled = true;
            checkBox2.Enabled = true;
            checkBox3.Enabled = true;
            checkBox4.Enabled = true;
            checkBox5.Enabled = true;
            checkBox6.Enabled = true;
            checkBox7.Enabled = true;
            checkBox8.Enabled = true;
            checkBox9.Enabled = true;
            checkBox10.Enabled = true;
            checkBox11.Enabled = true;
            checkBox12.Enabled = true;
            checkBox13.Enabled = true;
            checkBox14.Enabled = true;
            checkBox15.Enabled = true;
            checkBox16.Enabled = true;
        }

        public void desactivarCheck()
        {
            checkBox1.Enabled = false;
            checkBox2.Enabled = false;
            checkBox3.Enabled = false;
            checkBox4.Enabled = false;
            checkBox5.Enabled = false;
            checkBox6.Enabled = false;
            checkBox7.Enabled = false;
            checkBox8.Enabled = false;
            checkBox9.Enabled = false;
            checkBox10.Enabled = false;
            checkBox11.Enabled = false;
            checkBox12.Enabled = false;
            checkBox13.Enabled = false;
            checkBox14.Enabled = false;
            checkBox15.Enabled = false;
            checkBox16.Enabled = false;
        }

        public Form1()
        {
            InitializeComponent();
        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if(apuesta.SelectedIndex != -1)
            {
                activarLoteria();
            }
        }

        private void automatico_CheckedChanged(object sender, EventArgs e)
        {
            if (automatico.Checked)
            {
                checkbox[0] = checkBox1;
                checkbox[1] = checkBox2;
                checkbox[2] = checkBox3;
                checkbox[3] = checkBox4;
                checkbox[4] = checkBox5;
                checkbox[5] = checkBox6;
                checkbox[6] = checkBox7;
                checkbox[7] = checkBox8;
                checkbox[8] = checkBox9;
                checkbox[9] = checkBox10;
                checkbox[10] = checkBox11;
                checkbox[11] = checkBox12;
                checkbox[12] = checkBox13;
                checkbox[13] = checkBox14;
                checkbox[14] = checkBox15;
                checkbox[15] = checkBox16;
                
                for(int i = 0; i < 16; i++)
                {
                    checkbox[i].Enabled = false;
                }
            }
        }
    }
}
