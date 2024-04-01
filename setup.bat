@echo off
javac tic_tac_toe.java gameover.java Gui.java startmenu.java
echo java tic_tac_toe >> run.bat
start run.bat
del setup.bat