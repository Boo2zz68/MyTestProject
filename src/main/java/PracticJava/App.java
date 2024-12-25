package PracticJava;

import minus417.MyUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    //Конструктор приложения
    public App(){
        //Заголовок
        setTitle("Генератор тестовых данных");
        //Закрытие по кнопке крестик
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Размеры окна
        setBounds(100,100,300,300);
        //Шрифт
        Font font = new Font("Arrial", Font.BOLD, 20);
        //Адаптивная верстка
        setLayout(new FlowLayout());
        //Создание кнопки
        JButton jbutton = new JButton("Сгенерировать данные");
        //Добавили созданный объект шрифта к кнопке
        jbutton.setFont(font);
        //Указали расположение кнопки и добавили в приложение
        add(jbutton, BorderLayout.NORTH);
        //СОздание текстовых полей
        TextField textFieldNumber = new TextField("  Телефон  ");
        textFieldNumber.setFont(font);
        add(textFieldNumber);
        TextField textFieldINN = new TextField("    Инн    ");
        textFieldINN.setFont(font);
        add(textFieldINN);
        //Нажатие кнопки
        //ButtonAction buttonAction = new ButtonAction(jbutton);
        //jbutton.addActionListener(buttonAction);
        //Второй способ
        jbutton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Действие по нажатию кнопки
                        textFieldNumber.setText(MyUtils.generateTelephone());
                        textFieldINN.setText(MyUtils.generateINN());
                    }
                }
        );
        //Видимость на экране в тру
        setVisible(true);
        /* Чтобы создать сборку приложения руками: Project Structure -> Artifacts ->
        + -> JAR -> Из всех классов -> Выбрать класс запуска -> Ok
        Создание джарника: Build Artifact -> Build и в папке out добавится jar файл
        для запуска, можно перенести на Рабочий стол
         */
    }
}
