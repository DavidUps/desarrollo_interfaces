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

namespace Ruta
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Stream myStream = null;
            openFileDialog1.InitialDirectory = "C:\\";
            openFileDialog1.Filter = "JPG | *.jpg| PNG |*.png| BMP |*.bmp| Todos |*.*";
            openFileDialog1.FilterIndex = 2;
            openFileDialog1.FileName = "";
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {

                if ((myStream == openFileDialog1.OpenFile()) != null)
                {

                    textBox1.Text = openFileDialog1.FileName;
                }
            }                
        }

        private void openFileDialog1_FileOk(object sender, CancelEventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
