import 'package:carrot_market_ui/screens/chatting/chatting_screen.dart';
import 'package:carrot_market_ui/screens/heighborhood_life/neighborhood_life_screen.dart';
import 'package:carrot_market_ui/screens/home/home_screen.dart';
import 'package:carrot_market_ui/screens/my_carrot/my_carrot_screen.dart';
import 'package:carrot_market_ui/screens/near_me/near_me_screen.dart';
import 'package:flutter/material.dart';
import 'package:flutter/cupertino.dart';

class MainScreens extends StatefulWidget {
  const MainScreens({Key? key}) : super(key: key);

  @override
  State<MainScreens> createState() => _MainScreensState();
}

class _MainScreensState extends State<MainScreens> {
  int _selectedIndex = 0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: IndexedStack(
        index: _selectedIndex,
        children: [
          HomeScreen(),
          NeighborhoodLifeScreen(),
          NearMeScreen(),
          ChattingScreen(),
          MyCarrotScreen(),
        ],
      ),
      bottomNavigationBar: BottomNavigationBar(
        backgroundColor: Colors.white,
        type: BottomNavigationBarType.fixed,
        currentIndex: _selectedIndex,
        onTap: (index) {
          setState(
            () {
              _selectedIndex = index;
            },
          );
        },
        items: [
          const BottomNavigationBarItem(
            icon: Icon(CupertinoIcons.home),
            label: '홈',
          ),
          const BottomNavigationBarItem(
            icon: Icon(CupertinoIcons.square_on_square),
            label: '동네생활',
          ),
          const BottomNavigationBarItem(
            icon: Icon(CupertinoIcons.placemark),
            label: '내 근처',
          ),
          const BottomNavigationBarItem(
            icon: Icon(CupertinoIcons.chat_bubble_2),
            label: '채팅',
          ),
          const BottomNavigationBarItem(
            icon: Icon(CupertinoIcons.person),
            label: '나의 당근',
          ),
        ],
      ),
    );
  }
}
