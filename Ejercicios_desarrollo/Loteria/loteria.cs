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
        int seleccionadas = 0;
        public Loterias()
        {
            InitializeComponent();
            checkbox[0] = check1;
            checkbox[1] = check5;
            checkbox[2] = check9;
            checkbox[3] = check13;
            checkbox[4] = check2;
            checkbox[5] = check3;
            checkbox[6] = check4;
            checkbox[7] = check6;
            checkbox[8] = check7;
            checkbox[9] = check11;
            checkbox[10] = check10;
            checkbox[11] = check8;
            checkbox[12] = check12;
            checkbox[13] = check14;
            checkbox[14] = check15;
            checkbox[15] = check16;

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
            if (apuesta.SelectedIndex != -1)
            {
                activarLoteria();
            }
                if (apuesta.SelectedIndex == 0)
                {
                    seleccionadas = 4;
                    //desactivarCheck();
                }
                if (apuesta.SelectedIndex == 1)
                {
                    //seleccionadas = 6;
                    //  desactivarCheck();
                }
                if (contador == 8 && apuesta.SelectedIndex == 2)
                {
                    //seleccionadas = 8;
                    //desactivarCheck();
                }
                
                // si selecciono 0 --> seleccionadas = 4
                // si selecciono 1 --> seleccionadas = 6
                // si selecciono 2 --> seleccionadas = 8

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

        private void click1(object sender, EventArgs e)
        {
            if (seleccionadas > 0)
            {
                if (check1.Checked)
                {
                    seleccionadas--;
                }
                else
                {
                    seleccionadas++;
                    
                }
            }
            if (seleccionadas == -1)
                check2.Checked = false;

        }
        private void click2(object sender, EventArgs e)
        {
            if (seleccionadas > 0)
            {
                if (check2.Checked)
                {
                    seleccionadas--;
                }
                else
                {
                    seleccionadas++;

                }
            }
            if (seleccionadas == -1)
                check2.Checked = false;
        }

        private void click3(object sender, EventArgs e)
        {
            if (seleccionadas > 0)
            {
                if (check3.Checked)
                {
                    seleccionadas--;
                }
                else
                {
                    seleccionadas++;

                }
            }
            if (seleccionadas == -1)
                check2.Checked = false;
        }

        private void click4(object sender, EventArgs e)
        {
            if (seleccionadas > 0)
            {
                if (check4.Checked)
                {
                    seleccionadas--;
                }
                else
                {
                    seleccionadas++;

                }
            }
            if (seleccionadas == -1)
                check2.Checked = false;
        }

        private void click5(object sender, EventArgs e)
        {
            if (seleccionadas > 0)
            {
                if (check5.Checked)
                {
                    seleccionadas--;
                }
                else
                {
                    seleccionadas++;

                }
            }
            if (seleccionadas == -1)
                check2.Checked = false;
        }

        private void click6(object sender, EventArgs e)
        {
            if (seleccionadas > 0)
            {
                if (check6.Checked)
                {
                    seleccionadas--;
                }
                else
                {
                    seleccionadas++;

                }
            }
            if (seleccionadas == -1)
                check2.Checked = false;
        }

        private void click7(object sender, EventArgs e)
        {
            if (check4.Checked)
            {
                seleccionadas--;
                if (seleccionadas == 0)
                {
                    desactivarCheck();

                }
            }

            else
                seleccionadas--;
        }

        private void click8(object sender, EventArgs e)
        {
            if (check6.Checked)
            {
                seleccionadas--;
                if (seleccionadas == 0)
                {
                    desactivarCheck();

                }
            }

            else
                seleccionadas--;
        }

        private void click9(object sender, EventArgs e)
        {
            if (check7.Checked)
            {
                seleccionadas--;
                if (seleccionadas == 0)
                {
                    desactivarCheck();

                }
            }

            else
                seleccionadas--;
        }

        private void click10(object sender, EventArgs e)
        {
            if (check11.Checked)
            {
                seleccionadas--;
                if (seleccionadas == 0)
                {
                    desactivarCheck();

                }
            }

            else
                seleccionadas--;
        }

        private void click11(object sender, EventArgs e)
        {
            if (check10.Checked)
            {
                seleccionadas--;
                if (seleccionadas == 0)
                {
                    desactivarCheck();

                }
            }

            else
                seleccionadas--;
        }

        private void click12(object sender, EventArgs e)
        {
            if (check8.Checked)
            {
                seleccionadas--;
                if (seleccionadas == 0)
                {
                    desactivarCheck();

                }
            }

            else
                seleccionadas--;
        }

        private void click13(object sender, EventArgs e)
        {
            if (check12.Checked)
            {
                seleccionadas--;
                if (seleccionadas == 0)
                {
                    desactivarCheck();

                }
            }

            else
                seleccionadas--;
        }

        private void click14(object sender, EventArgs e)
        {
            if (check14.Checked)
            {
                seleccionadas--;
                if (seleccionadas == 0)
                {
                    desactivarCheck();

                }
            }

            else
                seleccionadas--;
        }

        private void click15(object sender, EventArgs e)
        {
            if (check15.Checked)
            {
                seleccionadas--;
                if (seleccionadas == 0)
                {
                    desactivarCheck();

                }
            }

            else
                seleccionadas--;
        }

        private void click16(object sender, EventArgs e)
        {
            if (check16.Checked)
            {
                seleccionadas--;
                if (seleccionadas == 0)
                {
                    desactivarCheck();

                }
            }

            else
                seleccionadas--;
        }

        private void validar_Click(object sender, EventArgs e)
        {
            if (contador == 4 && apuesta.SelectedIndex == 0)
            {
                desactivarCheck();
            } else
            {
                if (contador == 6 && apuesta.SelectedIndex == 1)
                {
                    desactivarCheck();
                }
                else
                {
                    if (contador == 8 && apuesta.SelectedIndex == 2)
                    {
                        desactivarCheck();
                    }
                }
            }            
        }
    }
}
