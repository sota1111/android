import 'package:flutter/material.dart';

void main(){
  runApp(MyApp());
}

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context){
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('my birthday')
        ),
        body: Home(),
      ),
    );
  }
}

class Home extends StatelessWidget {
  const Home({
    super.key,
  });

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: Column(
        children:[
          Padding(
            padding: const EdgeInsets.all(10.0),
            child: TextField(
              decoration: InputDecoration(
                labelText: 'name',
                hintText: 'name',
                icon: Icon(Icons.account_circle)
              ),
            ),
          ),
          ElevatedButton(onPressed: (
            ) {
            showDatePicker(
              context: context,
              initialDate: DateTime(DateTime.now().year-10),
              firstDate: DateTime(DateTime.now().year-100),
              lastDate: DateTime(DateTime.now().year),);
          }, child: new Text('誕生日選択'),),
          ElevatedButton(onPressed: (
              ){print("ボタンを押しました");},
              child: Text("生まれてから何日目？"),
          )
        ],
      ),
    );
  }
}