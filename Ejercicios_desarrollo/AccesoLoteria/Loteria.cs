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
    public partial class Loterias : Form
    {
        CheckBox[] checkbox = new CheckBox[16];
        Random random = new Random();
        int contador = 0;
        public Loterias()
        {
            InitializeComponent();
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


        }
        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }
        //Activar labels lotria
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
        //Activar Check
        public void activarCheck()
        {
            for(int i = 0; i < checkbox.Length; i++)
            {
                checkbox[i].Enabled = true;
            }
        }
        //Desactivar Check
        public void desactivarCheck()
        {
            for (int i = 0; i < checkbox.Length; i++)
            {
                checkbox[i].Enabled = false;
            }
        }
        //Quitar Check
        public void quitarCheck()
        {
            for(int i = 0; i < checkbox.Length; i++)
            {
                checkbox[i].Checked = false;
            }
        }
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if(apuesta.SelectedIndex != -1)
            {
                activarLoteria();
            }
        }
        //Automatico
        private void automatico_CheckedChanged(object sender, EventArgs e)
        {
            if (automatico.Checked)
            {
                reintegro.Text = random.Next(0,11).ToString();
                desactivarCheck();
                //Simple
                if(apuesta.SelectedIndex == 0)
                {
                    quitarCheck();
                    for(int i = 0; i < 4; i++)
                    {
                        checkbox[random.Next(0,16)].Checked = true;
                    }
                }
                //Multiple
                if (apuesta.SelectedIndex == 1)
                {
                    quitarCheck();
                    for (int i = 0; i < 6; i++)
                    {
                        checkbox[random.Next(0, 16)].Checked = true;
                    }
                }
                //Extrema
                if (apuesta.SelectedIndex == 2)
                {
                    quitarCheck();
                    for (int i = 0; i < 8; i++)
                    {
                        checkbox[random.Next(0, 16)].Checked = true;
                    }
                }
            }
        }
        //Manual
        private void manual_CheckedChanged(object sender, EventArgs e)
        {
            activarCheck();
            reintegro.Text = random.Next(0,11).ToString();
            
            //Simple
            if (apuesta.SelectedIndex == 0)
            {
                quitarCheck();
                if (contador == 4)
                    desactivarCheck();
            }
            //Multiple
            if (apuesta.SelectedIndex == 1)
            {
                quitarCheck();
                if (contador == 6)
                    desactivarCheck();
            }
            //Extrema
            if (apuesta.SelectedIndex == 2)
            {
                quitarCheck();
                if (contador == 8)
                    desactivarCheck();
            }
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox1.Checked)
                contador++;
        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox2.Checked)
                contador++;
        }

        private void checkBox3_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox3.Checked)
                contador++;
        }

        private void checkBox4_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox4.Checked)
                contador++;
        }

        private void checkBox5_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox5.Checked)
                contador++;
        }

        private void checkBox8_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox8.Checked)
                contador++;
        }

        private void checkBox11_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox11.Checked)
                contador++;
        }

        private void checkBox14_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox14.Checked)
                contador++;
        }

        private void checkBox6_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox6.Checked)
                contador++;
        }

        private void checkBox9_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox9.Checked)
                contador++;
        }

        private void checkBox10_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox10.Checked)
                contador++;
        }

        private void checkBox15_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox15.Checked)
                contador++;
        }

        private void checkBox7_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox7.Checked)
                contador++;
        }

        private void checkBox12_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox12.Checked)
                contador++;
        }

        private void checkBox13_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox13.Checked)
                contador++;
        }

        private void checkBox16_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox16.Checked)
                contador++;
        }

        private void apostar_Click(object sender, EventArgs e)
        {

        }

        private void salir_Click(object sender, EventArgs e)
        {
            string mensaje = "Desea Salir";
            string titulo = "Desea salir";
            MessageBoxButtons opciones = MessageBoxButtons.OK;
            DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Exclamation);
            this.Visible = false;
        }
    }
}
