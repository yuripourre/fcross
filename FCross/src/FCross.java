import javax.swing.JFrame;

import br.com.etyllica.util.PathHelper;
import br.com.luvia.Luvia;
import br.com.luvia.core.context.ApplicationGL;
import br.com.runaway.GameApplicationGL;


public class FCross extends Luvia {

	public FCross() {
		super(800,600);
		
		setTitle("Tomb Runaway 3D");		
		
		centerCursor();
	}
	
	@Override
	protected JFrame createFrame(int w, int h) {
		JFrame frame = super.createFrame(w, h);
		frame.setUndecorated(true);
		
		return frame;
	}

	// Main program
	public static void main(String[] args) {
		FCross engine = new FCross();
		engine.init();
	}
	
	@Override
	public ApplicationGL startApplication() {

		String path = PathHelper.currentDirectory();
		
		setPath(path+"../");
		luviaCore.hideDefaultCursor();
		
		//JoystickLoader.getInstance().start(1);
		//new Thread(JoystickLoader.getInstance()).start();
				
		//return new MainMenu(w, h);
		return new GameApplicationGL(w, h, 1);
	}

}
