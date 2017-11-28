using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace AccesoLoteria
{
    public partial class Acceso : Form
    {
        //private object openFileDialog1;
        string email_comprobar,
                contrasenia_comprobar;

        public Acceso()
        {
            InitializeComponent();
        }
        public void limpiar()
        {

            email_introducir.Text = "";
            contrasena_introducir.Text = "";
            fecha_introducir.Value = DateTime.Today;
            imagen_introducir.ImageLocation = "";
        }
        private void imagen_introducir_Click(object sender, EventArgs e)
        {
            Stream myStream = null;
            openFileDialog1.InitialDirectory = "C:\\";
            openFileDialog1.Filter = "Archivos de imagen| *.jpg; *.png; *.bmp";
            openFileDialog1.FilterIndex = 2;
            openFileDialog1.FileName = "";
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {

                if ((myStream == openFileDialog1.OpenFile()) != null)
                {
                    //Se pone la imagen
                    imagen_introducir.ImageLocation = openFileDialog1.FileName;
                    //textBox1.Text = openFileDialog1.FileName;
                }
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            limpiar();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            bool email = false,
                 contrasenia = false,
                 fecha = false,
                 imagen = false;
            //EMAIL
            String[] partir = email_introducir.Text.Split('@');
            if (partir[1].Equals("gmail.com"))
            {
                email = true;
            }else
            {
                string mensaje = "El correo introducido no es compatible";
                string titulo = "Correo incorrecto";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Error);
            }
            //PASSWORD
            String[] contrasena = contrasena_introducir.Text.Split('+', '-', '*', '/');
            if(contrasena[0].Length >= 4)
            {
                contrasenia = true;
            }
            else
            {
                string mensaje = "La contraseña introducida no es compatible";
                string titulo = "Contraseña incorrecta";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Error);
            }
            //FECHA
            String[] fechaCorte = fecha_introducir.Text.Split('/');
            int anio = Int32.Parse(fechaCorte[2]);
            if (anio <= 1999)
            {
                fecha = true;
                
            }
            else
            {
                string mensaje = "No eres mayor de edad";
                string titulo = "Fecha incorrecto";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Error);
            }

            //IMAGEN
            if (imagen_introducir.ImageLocation.Equals(""))
            {
                string mensaje = "No ha introducido foto de perfil";
                string titulo = "Foto incorrecto";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Error);
            }
            else
            {
                imagen = true;
            }

            //Comprobar
            if(email || contrasenia || fecha || imagen)
            {
                groupBox2.Enabled = true;
                string mensaje = "Registro correcto";
                string titulo = "Foto incorrecto";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Asterisk);
                email_comprobar = email_introducir.Text.ToString();
                contrasenia_comprobar = contrasena_introducir.Text.ToString();
                groupBox1.Enabled = false;

            }else
            {
                string mensaje = "Registro incorrecto";
                string titulo = "Foto incorrecto";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Error);

            }
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox1.Checked)
            {
                textBox6.Text = textBox5.Text.ToString();
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            bool email_login = false,
                contrasenia_login = false;
            if (textBox4.Text.ToString().Equals(email_comprobar))
            {
                email_login = true;
            }
            if (textBox5.Text.ToString().Equals(contrasenia_comprobar))
            {
                contrasenia_login = true;
            }
            if(email_login || contrasenia_login)
            {
                string mensaje = "Login Correcto";
                string titulo = "Login Correcto";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Asterisk);
                Loteria.Loterias loteria = new Loteria.Loterias();
                loteria.Show();
                this.Visible = false;
            }
        }
        //login correcto
        private void button3_Click(object sender, EventArgs e)
        {
            textBox4.Text = "";
            textBox5.Text = "";
            textBox6.Text = "";
            groupBox1.Enabled = true;
            groupBox2.Enabled = false;
            
            
            
        }

        private void groupBox2_Enter(object sender, EventArgs e)
        {
            limpiar();
        }
    }
}
