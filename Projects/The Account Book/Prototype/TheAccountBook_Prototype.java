import java.awt.*;
import java.awt.event.*;
import java.io;
// Импортируем необходимые пакеты

public class Main {
	public static void main(String args[]) {
	
	class AccountBookSheet extends Object {
		class AccountBookEntity extends Object implements Serializable {
			String StartDate;
			String Summ;
			String Bargain;
			String Individual;
			String Result;
			String FinalDate;
			String Comment;
			// эти строки инкапсуллируют поля сущности
			
		}
		// Это служебный класс программы - средства для работы с данными, представляет собой сущность данных
		
		public static final String StartDateColumn = "Start date";
		public static final String SummColumn = "Summ";
		public static final String BargainColumn = "Bargain";
		public static final String IndividualColumn = "Individual";
		public static final String ResultColumn = "Result";
		public static final String FinalDateColumn = "Final date";
		public static final String CommentColumn = "Comment";
		// эти статические строки используются как константы - они служат для их использования программой
		
	}
	// Служебный класс программы - средства для работы с данными, контейнер сущностей данных и прочего

		AccountBookEntity Entity0 = new AccountBookEntity();
		AccountBookEntity Entity1 = new AccountBookEntity();
		AccountBookEntity Entities[] = {Entity1, Entity2};
		// Создаем сущности данных, в целях возможных дальнейших применений создаем из них массив
	
		Entity0.StartDate = AccountBookSheet.StartDateColumn;
		Entity0.Summ = AccountBookSheet.SummColumn;
		Entity0.Bargain = AccountBookSheet.BargainColumn;
		Entity0.Individual = AccountBookSheet.IndividualColumn;
		Entity0.Result = AccountBookSheet.ResultColumn;
		Entity0.FinalDate = AccountBookSheet.FinalDateColumn;
		Entity0.Comment = AccountBookSheet.CommentColumn;
		// Entity0 - это сущность, используемая программой, поэтому инициализируется предопределенными значениями
		
		File fd = new File("C://TheAccountBook");
		if (fd.exists() = false) {
			boolean fdcreated = fd.mkDir();
		}
	
		File ff = new File("C://TheAccountBook/DATAE.");
		if (ff.exists() = false) {
			boolean fdcreated = ff.createNewFile();
		}
	// Формируем основные файлы на диске
	
	class UserWindowFrame extends Frame {
		UserWindowFrame(String s) {
			this.setTitle(s);
			this.setSize(480, 270);
			this.setVisible(true);
			// основная составляющая кода конструктора
		
			UserWindowAdapter Uwa = new UserWindowAdapter(this);
			addWindowListener(Uwa);
			// подвесили обработчик событий окна
		
			MenuBar WindowMenu = new MenuBar();
			setMenuBar(WindowMenu);
		
			Menu FileMenu = new Menu("File");
			Menu SearchMenu = new Menu ("Search");
			Menu AboutMenu = new Menu("Help");
		
			MenuItem Ni, Oi, Si, Di, Ei;
			FileMenu.add(Ni = new MenuItem("New"));
			FileMenu.add(Oi = new MenuItem("Open"));
			FileMenu.add(Si = new MenuItem("Save as"));
			FileMenu.add(Di = new MenuItem("Delete"));
			FileMenu.add(Ei = new MenuItem("Exit"));
		
			MenuItem Sei, Sni, Spi;
			SearchMenu.add(Sei = new MenuItem("Search"));
			SearchMenu.Sei.setEnabled(false);
			SearchMenu.add(Sni = new MenuItem("Search next"));
			SearchMenu.Sni.setEnabled(false);
			SearchMenu.add(Spi = new MenuItem("Search previous"));
			SearchMenu.Spi.setEnabled(false);
		
			MenuItem Ap;
			AboutMenu.add(Ap = new MenuItem("About programm"));
		
			WindowMenu.add(FileMenu);
			WindowMenu.add(SearchMenu);
			WindowMenu.add(AboutMenu);
			//Меню приложения
		
			class MenuEl implements ActionListener, ItemListener {
				public void actionPerformed(ActionEvent Ae) {
					return;
				}
			
				public void itemStateChanged(ItemEvent Ie) {
					CurrentItem = getItem();				
					switch (CurrentItem) {
						case Ni:	FileDialog NewFd	= new FileDialog(MainWindow, "New", FileDialog.SAVE); break;		// Это пункт "New" меню File
						case Oi:	FileDialog OpenFd	= new FileDialog(MainWindow, "Open", FileDialog.LOAD); break;		// Это пункт "Open" меню File
						case Si:	FileDialog SaveAsFd	= new FileDialog(MainWindow, "Save As", FileDialog.SAVE)(); break;	// Это пункт "Save As" меню File
						case Di:	FileDialog DeleteFd	= new FileDialog(MainWindow, "Delete", FileDialog.SAVE); break;		// Это пункт "Delete" меню File
						case Ei:	System.exit(); break;																	// Это пункт "Exit" меню File
						case Sei:	System.exit(); break;																	// Это пункт "Search" меню Search, в прототипе не реализуется (т.к.прототип работает только с одной сущностью)
						case Sni:	System.exit(); break;																	// Это пункт "SearchNext" меню Search, в прототипе не реализуется (т.к.прототип работает только с одной сущностью)
						case Spi:	System.exit(); break;																	// Это пункт "SearchPrevious" меню Search, в прототипе не реализуется (т.к.прототип работает только с одной сущностью)
						case Ap:	ApDialog ApD		= new ApDialog(MainWindow, "About Programm");; break;				// Создаем соответствующее диалоговое меню
					}
			
				}
			}
			// Объявляем класс обработчика событий меню
		
			MenuEl MyMenuEl = new MenuEl();
			Sei.addActionListener(MyMenuEl);
			Sni.addActionListener(MyMenuEl);
			Spi.addActionListener(MyMenuEl);
			Ni.addActionListener(MyMenuEl);
			Oi.addActionListener(MyMenuEl);
			Si.addActionListener(MyMenuEl);
			Di.addActionListener(MyMenuEl);
			Ei.addActionListener(MyMenuEl);
			Ap.addActionListener(MyMenuEl);
			// Создаем экземпляр обработчика событий меню, подвешиваем обработчики событий к пунктам меню приложения
		
			class ApDialog implements ActionListener {
				MyDialog(Frame Pf, String Ts) {
					super(Pf, Ts, false);
					setLayout(new FlowLayout());
					setSize(480, 270);
					setVisible(true);
					add(new Label("About Programm: This is The Account Book's Prototype."));
					add(Button ApB = new Button("OK"));
					addActionListener(this);
					
					public void actionPerformed(ActionEvent Ae) {
						dispose();
					}
					
				}
		
			}
			// Объявляем конструктор диалогового окна "About Programm"

		}
	
	}
	// Объявляем класс окна приложения

	UserWindowFrame MainWindow = new UserWindowFrame("The Account book");
	// создаем экземпляр окна

	class UserWindowAdapter extends WindowAdapter {
		UserWindowFrame U;
		public UserWindowAdapter(UserWindowFrame U) {
			this.U = U;
		}	
		
		public void windowClosing(WindowEvent W) {
			U.setVisible(false);
			System.exit(0);
		}
		
	}
	// Класс - приемник событий уровня самого окна

	TextField StartField1, SummField1, BargainField1, IndividualField1, ResultField1, FinalField1, CommentField1 = new TextField();
	TextField StartField2, SummField2, BargainField2, IndividualField2, ResultField2, FinalField2, CommentField2 = new TextField();
	// Создаем текстовые поля окна приложения
	
	class TfEventReceiver implements KeyListener {
		public void keyPressed (KeyEvent Ke) {
			return;
		}
		
		public void keyReleased(KeyEvent Ke) {
			return;
		}
		
		public void keyTyped(KeyEvent Ke) {
			if (Ke.getKeyCode() = Ke.VK_ENTER) {
				KeyEvent Kev = Ke.getSource();
				switch (Kev) {
					case Kev StartField2:		Entity1.StartDate		= Kev.getText(); break;
					case Kev SummField2:		Entity1.Summ			= Kev.getText(); break;
					case Kev BargainField2:		Entity1.Bargain			= Kev.getText(); break;
					case Kev IndividualField2: 	Entity1.Individual 		= Kev.getText(); break;
					case Kev ResultField2:		Entity1.Result 			= Kev.getText(); break;
					case Kev FinalField2:		Entity1.FinalDate 		= Kev.getText(); break;
					case Kev CommentField2:		Entity1.Comment 		= Kev.getText(); break;
					}
					
			}
			
			return;
		}
		
	}
	
	TfEventReceiver Tfer = new TfEventReceiver();
	
	StartField1.setText(Entity0.StartDate);
	StartField1.setEditable(false);
	
	SummField1.setText(Entity0.Summ);
	SummField1.setEditable(false);
	
	BargainField1.setText(Entity0.Bargain);
	BargainField.setEditable(false);
	
	IndividualField1.setText(Entity0.Individual);
	IndividualField1.setEditable(false);
	
	ResultField1.setText(Entity0.Result);
	ResultField1.setEditable(false);
	
	FinalField1.setText(Entity0.FinalDate);
	FinalField1.setEditable(false);
	
	Commentfield1.setText(Entity0.Comment);
	Commentfield1.setEditable(false);
	
	StartField2.setText(Entity1.StartDate);
	StartField2.setEditable(true);
	StartField2.addKeyListener(Tfer);
	
	SummField2.setText(Entity1.Summ);
	SummField2.setEditable(true);
	SummField2.addKeyListener(Tfer);
	
	BargainField2.setText(Entity1.Bargain);
	BargainField2.setEditable(true);
	BargainField2.addKeyListener(Tfer);
	
	IndividualField2.setText(Entity1.Individual);
	IndividualField2.setEditable(true);
	IndividualField2.addKeyListener(Tfer);
	
	ResultField2.setText(Entity1.Result);
	ResultField2.setEditable(true);
	ResultField2.addKeyListener(Tfer);
	
	FinalField2.setText(Entity1.FinalDate);
	FinalField2.setEditable(true);
	FinalField2.addKeyListener(Tfer);
	
	Commentfield2.setText(Entity1.Comment);
	Commentfield2.setEditable(true);
	Commentfield2.addKeyListener(Tfer);
	// Инициализируем текстовые поля, задаем их изменяемость, к изменяемым полям подвешиваем обработчики событий
	
	public void readingFromFile() {
	try(ObjectInputStream OIS = new ObjectInputstream(new FileInputStream("C://TheAccountBook/DATAE."))) {
			OIS.readObject(Entities[1])
	} catch(Exception E) {
		System.out.println(E.getMessage());
	}
	}
	// Метод чтения из файла, в прототипе он не вызывается
	
	public void writingToFile() {
	try(ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("C://TheAccountBook/DATAE."))) {	
		OOS.writeObject(Entities[1]);
	} catch(Exception E) {
		System.out.println(E.getMessage());
	}
	}
	// Метод записи в файл, в прототипе он не вызываетя
	
	GridBagLayout DefLayout = new GridBagLayout();
	MainWindow.setLayout(DefLayout);
	// Применяем диспетчер компоновки
	
	GridBagConstraints GBC0 = new GridBagConstraints();
	GBC0.greedy = 1;
	DefLayout.setConstraints(StartField1, GBC0);
	DefLayout.setConstraints(SummField1, GBC0);
	DefLayout.setConstraints(StartField1, GBC0);
	DefLayout.setConstraints(BargainField1, GBC0);
	DefLayout.setConstraints(IndividualField1, GBC0);
	DefLayout.setConstraints(ResultField1, GBC0);
	DefLayout.setConstraints(FinalField1, GBC0);
	DefLayout.setConstraints(CommentField1, GBC0);
	// Применены ограничения компоновки для первой юзерской сущности
	
	GridBagConstraints GBC1 = new GridBagConstraints();
	GBC1.greedy = 2;
	DefLayout.setConstraints(StartField2, GBC1);
	DefLayout.setConstraints(SummField2, GBC1);
	DefLayout.setConstraints(StartField2, GBC1);
	DefLayout.setConstraints(BargainField2, GBC1);
	DefLayout.setConstraints(IndividualField2, GBC1);
	DefLayout.setConstraints(ResultField2, GBC1);
	DefLayout.setConstraints(FinalField2, GBC1);
	DefLayout.setConstraints(CommentField2, GBC1);
	// Применены ограничения компоновки для второй юзерской сущности

	MainWindow.add(Startfield1);
	MainWindow.add(SummField1);
	MainWindow.add(BargainField1);
	MainWindow.add(IndividualField1);
	MainWindow.add(ResultField1);
	MainWindow.add(FinalField1);
	MainWindow.add(commentField1);
	MainWindow.add(Startfield2);
	MainWindow.add(SummField2);
	MainWindow.add(BargainField2);
	MainWindow.add(IndividualField2);
	MainWindow.add(ResultField2);
	MainWindow.add(FinalField2);
	MainWindow.add(commentField2);
	// Добавляем текстовые поля в окно приложения
	
	}
	
}
// Главный класс программы