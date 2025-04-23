package dev.anvilcraft.rg.spp;

import dev.anvilcraft.rg.RollingGateCategories;
import dev.anvilcraft.rg.api.RGValidator;
import dev.anvilcraft.rg.api.Rule;

public class ServerPlusPlusServerRules {
    // 快速发送坐标
    @Rule(
        allowed = {"ops", "true", "false", "1", "2", "3", "4"},
        categories = {ServerPlusPlus.MOD_ID, RollingGateCategories.COMMAND},
        validator = RGValidator.CommandRuleValidator.class
    )
    public static String commandHere = "ops";
    // 快速定位玩家
    @Rule(
        allowed = {"ops", "true", "false", "1", "2", "3", "4"},
        categories = {ServerPlusPlus.MOD_ID, RollingGateCategories.COMMAND},
        validator = RGValidator.CommandRuleValidator.class
    )
    public static String commandWhereis = "ops";
    // 待办事项清单
    @Rule(
        allowed = {"ops", "true", "false", "1", "2", "3", "4"},
        categories = {ServerPlusPlus.MOD_ID, RollingGateCategories.COMMAND},
        validator = RGValidator.CommandRuleValidator.class
    )
    public static String commandTodo = "ops";
    // 地标管理菜单
    @Rule(
        allowed = {"ops", "true", "false", "1", "2", "3", "4"},
        categories = {ServerPlusPlus.MOD_ID, RollingGateCategories.COMMAND},
        validator = RGValidator.CommandRuleValidator.class
    )
    public static String commandLoc = "ops";
    // 白名单管理
    @Rule(categories = {ServerPlusPlus.MOD_ID, RollingGateCategories.COMMAND})
    public static boolean commandWlist = false;
    // 封禁名单管理
    @Rule(categories = {ServerPlusPlus.MOD_ID, RollingGateCategories.COMMAND})
    public static boolean commandBlist = false;
    // 简单获取op
    @Rule(categories = {ServerPlusPlus.MOD_ID, RollingGateCategories.COMMAND})
    public static boolean commandSop = false;
    // 服务器玩家转移命令
    @Rule(categories = {ServerPlusPlus.MOD_ID, RollingGateCategories.COMMAND})
    public static boolean commandTransfer = false;
    // 快速ping好友
    @Rule(categories = ServerPlusPlus.MOD_ID)
    public static boolean fastPingFriend = false;
    // 欢迎玩家
    @Rule(categories = ServerPlusPlus.MOD_ID)
    public static boolean welcomePlayer = false;
    //创造玩家无碰撞检测
    @Rule(
        allowed = {"true", "false"},
        categories = ServerPlusPlus.MOD_ID
    )
    public static boolean creativeNoClip = false;
}
