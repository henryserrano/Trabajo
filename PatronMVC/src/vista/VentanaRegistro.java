package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.vo.PersonaVo;

import controlador.Coordinador;


public class VentanaRegistro extends JFrame implements ActionListener{

	private Coordinador miCoordinador; //objeto miCoordinador que permite la relacion entre esta clase y la clase coordinador
	private JLabel labelTitulo;
	private JTextField textCod,textNombre,textEdad,textTelefono,textProfesion, textApellido, textCiudad;
	private JLabel cod,apellido,edad,ciudad,telefono,profesion;
	private JButton botonGuardar,botonCancelar;
	
	/**
	 * constructor de la clase donde se inicializan todos los componentes
	 * de la ventana de registro
	 */
	public VentanaRegistro() {

		botonGuardar = new JButton();
		botonGuardar.setBounds(130, 249, 120, 25);
		botonGuardar.setText("Registrar");
		
		botonCancelar = new JButton();
		botonCancelar.setBounds(272, 249, 120, 25);
		botonCancelar.setText("Cancelar");

		labelTitulo = new JLabel();
		labelTitulo.setText("REGISTRO DE PERSONAS");
		labelTitulo.setBounds(120, 20, 380, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));

		cod=new JLabel();
		cod.setText("Codigo");
		cod.setBounds(20, 80, 80, 25);
		getContentPane().add(cod);
		
		
		telefono=new JLabel();
		telefono.setText("telefono");
		telefono.setBounds(290, 160, 80, 25);
		getContentPane().add(telefono);
		
		JLabel nombre = new JLabel("nombre");
		nombre.setBounds(20, 125, 46, 14);
		getContentPane().add(nombre);
		
		JLabel apellido = new JLabel("apellido");
		apellido.setBounds(24, 165, 46, 14);
		getContentPane().add(apellido);
		
		JLabel ciudad = new JLabel("ciudad");
		ciudad.setBounds(284, 201, 46, 14);
		getContentPane().add(ciudad);
		
		edad=new JLabel();
		edad.setText("Edad");
		edad.setBounds(290, 120, 80, 25);
		getContentPane().add(edad);
		
		profesion=new JLabel();
		profesion.setText("Profesion");
		profesion.setBounds(20, 196, 80, 25);
		getContentPane().add(profesion);
		
		apellido=new JLabel();
		apellido.setText("Apellido");
		
		ciudad=new JLabel();
		ciudad.setText("Ciudad");
		ciudad.setBounds(290, 210, 80, 25);
		
		textCod=new JTextField();
		textCod.setBounds(80, 80, 80, 25);
		getContentPane().add(textCod);
		
		textNombre=new JTextField();
		textNombre.setBounds(80, 120, 190, 25);
		getContentPane().add(textNombre);
		
		textTelefono=new JTextField();
		textTelefono.setBounds(340, 160, 80, 25);
		getContentPane().add(textTelefono);
		
		textEdad=new JTextField();
		textEdad.setBounds(340, 120, 80, 25);
		getContentPane().add(textEdad);
		
		textProfesion=new JTextField();
		textProfesion.setBounds(80, 196, 190, 25);
		getContentPane().add(textProfesion);
		
		textApellido=new JTextField();
		textApellido.setBounds(80, 160, 190, 25);
		getContentPane().add(textApellido);
		
		textCiudad=new JTextField();
		textCiudad.setBounds(340, 196, 107, 25);
		getContentPane().add(textCiudad);
		
		botonGuardar.addActionListener(this);
		botonCancelar.addActionListener(this);
		getContentPane().add(botonCancelar);
		getContentPane().add(botonGuardar);
		getContentPane().add(labelTitulo);
		limpiar();
		setSize(473	, 349);
		setTitle("CoDejaVu : Patrones de Diseño/MVC");
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		

	}


	private void limpiar() 
	{
		textCod.setText("");
		textNombre.setText("");
		textApellido.setText("");
		textEdad.setText("");
		textTelefono.setText("");
		textProfesion.setText("");
		textCiudad.setText("");
		
	}


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==botonGuardar)
		{
			try {
				PersonaVo miPersona=new PersonaVo();
				miPersona.setIdPersona(Integer.parseInt(textCod.getText()));
				miPersona.setNombrePersona(textNombre.getText());
				miPersona.setApellidoPersona(textApellido.getText());
				miPersona.setTelefonoPersona(Integer.parseInt(textTelefono.getText()));
				miPersona.setEdadPersona(Integer.parseInt(textEdad.getText()));
				miPersona.setProfesionPersona(textProfesion.getText());
				miPersona.setCiudadPersona(textCiudad.getText());
				
				miCoordinador.registrarPersona(miPersona);	
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource()==botonCancelar)
		{
			this.dispose();
		}
	}
}
