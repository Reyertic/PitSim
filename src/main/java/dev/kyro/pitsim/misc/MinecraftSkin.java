package dev.kyro.pitsim.misc;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
public class MinecraftSkin {
	public static List<MinecraftSkin> minecraftSkins = new ArrayList<>();

	static {
//		Overworld
		new MinecraftSkin("KyroKrypt",
				"ewogICJ0aW1lc3RhbXAiIDogMTY3MzIyNzUzMDAyNSwKICAicHJvZmlsZUlkIiA6ICIwMWFjYmI0OTYzNTc0NTAyODFjYWU3OWY0YjMxYTQ0ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJLeXJvS3J5cHQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjZhNGFkOGM3ZDRiM2IzMGRlODdiZjc5NTc2MjdiNzdlMWJiYjYzYzFhZjMyNzcyYTg0MWZmYTUxMjVhNzZiIgogICAgfQogIH0KfQ==",
				"rLwh109BDhqN+SKMT2vcfi8ApkxxxWAWlEHroPEDEhSDBB20lTYON256uUtVfoNLB8Ajxls+kj1sUA6Akn/mfsKcVzMT2VeA00DTmgh60tOuR5LtQn8iHxunzmREsLJYXNqW3P6SRA+FD0TWUWeouDhyzknRmn/Y4FEh83v9fed00Rj6JW3tg0Danp814FyZ4KteLEGmXrROBaCut/HUgr77SFuO73MJyesuuX92ApfSZcgNXpMzLo5YDo1JxfFwzMCKJtjsmYwvUvabDLQu8v+KrUIbjxArt+uyzunbTTDNK8mhemtmSM0ds4l8Qp2EcBkhiq9yk7oJsnvr1eqZvvIjCVy2Yn0jGxnRO6Su6bgrluhP/mzumCuGjzWsWW2zkfSkTc7JXHe+ZrvtYZdMfV+BOuxpan8AcG9C4eA+nZ+srvkLi5IPRKb4NoNEYVWVREndSVshV90si6I7t5S6EOoTXO3QBEdFoESYjCGEEveeAHSK5r5Xjc9ylhcP8T8i1OL8IPdSXvqKpsQWEPbW4JSPHhtYPF+IBj5JmvKb3qK819UsjSMHAqwD2105cqV0HSVYXZ+29ebl5Hc2gp69WFOnD/JWr05XDchocr+DTtgD9cuet2PsTqYhjaZJIqS3gOUu3XsfZDVbXrnVskIw67DyFBW2bEqM4kJEIHA7HmY="
		);
		new MinecraftSkin("wiji1",
				"ewogICJ0aW1lc3RhbXAiIDogMTY3NTQ3OTY5OTUxNCwKICAicHJvZmlsZUlkIiA6ICI1YzA2NjI2YzY2YmY0OGE5ODRjYmYyNjgzZTZhY2E4NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ3aWppMSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mOWNmNzA5NTM0ZjlmMGU0MGZjYjg0YTY1MmRkOTA0M2JlYThhYzEwYzJmNTNmY2EzZWM3MzA2ODU4ZTk4ODkwIgogICAgfSwKICAgICJDQVBFIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yMzQwYzBlMDNkZDI0YTExYjE1YThiMzNjMmE3ZTllMzJhYmIyMDUxYjI0ODFkMGJhN2RlZmQ2MzVjYTdhOTMzIgogICAgfQogIH0KfQ==",
				"xWuzr0re00/xUmR/dLOc3bjgZzqkJ5IVzVDVuE1s6/D5sdyFypfKHA0palivvnhiiIrmZV8pxdHX5MBOuoegw+PDmce0n4kt/aEKfSM2CIEfCDrXOV4volKhKowo2ulCkO8s6BG7ZOaF4RAKWHOivrvcYtNUOyodjwvJ+Ie6fexVxPN7REqdP0Wa4JSJ98VXmFhO4wdQSAxt7cM5zT+CriPWXWymJujmEMN0dK6+2PhDJv1PxbYPIEwgp2yU0TwIWKsp8Uci7V30K7KMHVaFMR78ED/6x4hSPqNpTpN7Z0yGot3fS+G4B3Ef0ir1BwZlzBzZodGP+6GwfZxoDdmT0vvCHe8j+oci4tKSHLADMOGtoFycKrj12TMvcuLMKBQw012npdqO9vC0TPS4dFr1G2CiW3PSyIz7q90bqvjA+ks0/nhYfmOpGNkBk045LRLUj5bQFbDEh6V3pnXhPq9+2jf9Oxk5tp+aqw2tPZuoV9daI09x4pari92mACsoYCu6Ux+/jlANgYVeqCZZHPR6CJ3YEeD0uHqJwaz2gTzFsz8BLSebDq9YsZ8SyQRCJ+2kbiW2XaT4NZI541GbTgX3WAee4OttBoMfCYD1ZYGmVwuyCgJfhYdyV9k0in4RIbjchWzTFkVTkFfHPvtZPPBrDpvs70G3MNKdPE2dYOy0DY4="
		);
		new MinecraftSkin("Splkpig",
				"ewogICJ0aW1lc3RhbXAiIDogMTY3MzIyNzU4NzYxMCwKICAicHJvZmlsZUlkIiA6ICI3NWZiNDFiYjQ4NzU0MDg5OWE3ZmNiNTUwOWFjZWI0YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTcGxrcGlnIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZmMDIwZGM5YWE2ZmI2NWJkNzBjYTA5ZTNlNDc1NmE5NGNjYWVlNTBhZDk1MTA5NDhlZmY1YTE0OTJlMDkxZWQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfSwKICAgICJDQVBFIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yMzQwYzBlMDNkZDI0YTExYjE1YThiMzNjMmE3ZTllMzJhYmIyMDUxYjI0ODFkMGJhN2RlZmQ2MzVjYTdhOTMzIgogICAgfQogIH0KfQ==",
				"GIF6HBGI2mZc+X7QXZYcdm3FhkyqsV+X2OzkJFTjWtSQO0nFxU/weFnIOMw5s+6xCc2xZx2CUK0cJdwQ0sSGYoW89l+TwgONyprJ4Echk2duVPTqiwKjTK82DE11U8sYZGEgwoKape0p6Kh5XUyf/UwwOODQTThcRfqWo9+QNb9d9Hzc46Jshnf0OPbFoox6ds2gj8YgxqtuR8vaoFhQi6iaxvgaARCTuzFvfaJpUFLszbLEZWi64m/J5vFqNoBbQFIN1sojMj/HgFmrtAmDo66GOBmahWX59ux+ZAEEy8nvT/QdPADyadBaDyhxj71rmgKKx21PxtaXRU3ZK640ME3P6nBJGs3alMROxhHc/gEiDtZtZ/5YG3f3s7Xik5zHHv48N54Qj8kaK6zeMIBIK/w323+SimEwQ5BKv9YDJrTQsFwAJQWqgePY3yNznfI0UqvJIQQNrdVn33OFn3lq3qtkjVDdDCkCfgCpSjKFZHfsBZm8Z6U1YMVB+4RZR7/krF8+xePf9rX71xu+phkwGeLqApkwnCnZZrolo4eOCNqKco8tAadtL1LRf/vNqDAlEWcApIPbG5Gp6/qAIRkDvricc475tyyZragE+rJAbkcgmuNbyzyz4j39oUWjBTgNjLFzlqxvuLqPf9xSuBT46iMIpOAMYaUxieGDgVUoDZc="
		);
		new MinecraftSkin("Revernal",
				"ewogICJ0aW1lc3RhbXAiIDogMTY3MzIyNzgxNzExMSwKICAicHJvZmlsZUlkIiA6ICJjMjZmMTg4MmU1ZGM0NzMxYjgxMWFhZjdmZDM0MWFmNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXZlcm5hbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85OWRjMjdlYWQxZDg4NDY5MmY4ZDlkYWNkNzAyYjE2OWM0ODBmMmVhZjgwMzUwOTY5MTgxNzZlY2JlOTdlZDk5IgogICAgfSwKICAgICJDQVBFIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yMzQwYzBlMDNkZDI0YTExYjE1YThiMzNjMmE3ZTllMzJhYmIyMDUxYjI0ODFkMGJhN2RlZmQ2MzVjYTdhOTMzIgogICAgfQogIH0KfQ==",
				"oIJT7L2Kef5vybT77JyfAvpavvaln0I1yKxVaLotJ13pRsoj2sQPUOomUnxGW4xhS72mfu3Kab/5erp2T4VT9L1311fHG4PuGYLxKZZ9751oM2Hil3st75a+ymdYZ5HdTeJWrnJh48wzNwNvEEAVl7WYjH6vzaPSyUtD/k0fTaALl1qsAgUjINcrDV6MgTagyv1mTIAuwPQWUtxZsnpgpT3+TybXqc/xpTsMJZzK/wUOEqVIy7yzvUjHIO+PEjk/J+W6afoMdV57g4N5ZmqTpPt0XFI38fpmvasSTOK5yg1P0gqbJ6oVze8iyZIygUAZvzlNEPynfVzRT6glUgOw7NQQrhEUJdVslwi6MqDJaHuGYm5n5vmyvgEzFMxDgEEBTwUs4JGd8BDUa4BSWNf8kfFRdeONHMiWzFCqy+5dyMudKOLFlNsUoY+5uFvchGxP2bl4W2xLVT86U9j93MMBp7puVMhvDfGjDdK9xtWeiLm3/UpA4eLGD+YV6mmyg/NV+lT07u3xBIiU87pEuM/4Hh3ogLkbGkpjUlttMqy4UHRywTI/hhKSULLhQAJmtrkjm8iOInr7GIdGvWE8c+GW2GXZEHW/F3qYb+kpP6nmgs5inRKX03KlE50mVRzOBcy9WNhfiEeQnA0Dpp4ctjmMBs0xd3kGOiHwJxEygKvYMe0="
		);
		new MinecraftSkin("googasesportsog",
				"ewogICJ0aW1lc3RhbXAiIDogMTY3MzIyNzUyMjM3MSwKICAicHJvZmlsZUlkIiA6ICI4Njg4ODMzMGE3MGY0MWQ3ODc2NjQwYmMyYmQ3NDllYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJnb29nYXNlc3BvcnRzT0ciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWJiYzE1YmY1OGJlZWQ3ZWY2YzZmOTlhZjQ1NGI0ZWQ5NTgzYzg5NzQ4ZTBkOGEwMjM2NGU4N2Y5OTVjMDkzYSIKICAgIH0KICB9Cn0=",
				"tn8FdlZiTzhFI3xFsyqfYu6VfwOKwuT8PW5a6NkxfEtCwpPmGi0q2u8QWcEUmiliDhVeskXPcSavN+m9H+mlWdBkT0WLckMnYGGy9CdSXhcag1iWM3rpaNtIMTUItDb7LUZw5S+fAvGHkBe3ZkHg3aPrL7PnTpnHa0btzRbZCOoYIagNUEQh+EVZXFPDsJQhBT4SEJDgWIhT2xsNhfEmUQwn4YRHVvGFkCAPPIEO3Rr2Xyzxsbd11UfrX5TqW016pXQdVnX6OASio7V36x671xGPplzrmWCAAv3e7QPLwg4oDLvZpYJcYl0bueN5SJ50NcUL4M7x6OPf0zC82M1fBR3CnC+37P6kynfE6Ldqlh9VA25LGmrshkrwNNQLb0Qww7/KtWZNBu171KdxLkAbmLLlCdeIwBvQIpidtBXXbgik9scnrzjosTJeb1riOcZfn4Q7mIIDznEJqhcQtXONh09s+akeHgcJkHLS03rWqVA4WOwHk8kNTfZWsm5olfRsVfDxxvIdlxtydHRO5KOSy6S94QXrsGDsWDZBtAt6gtVBS9r2qgkvmCcSk2Rp6ZwQkskhfnF/qTUflqcklS1mhQN6n5mpdv70xerwZY70O62aogJTdTEIqm7MtA+JEk5eii/+Usn6Owa7dgI7MxgWO0uRm9R4Tk38q9nuQXiLQVU="
		);
		new MinecraftSkin("Whyplay",
				"ewogICJ0aW1lc3RhbXAiIDogMTY3NDk4NjY1NjIyMiwKICAicHJvZmlsZUlkIiA6ICJlOTEzZmQwMWU4NGU0YzZlYWQ1Yjc0MTlhMTJkZTQ4MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJXaHlwbGF5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE0NDE3MTZiMWMyNjFmN2RmZjg4OTc1MjgyM2Y0MmM5YWIzOTkxZTFhYTM1MjBmNzI3YWEyNjQ1ODEzMDIwODEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
				"OiMBUrHAraijW6GPIYfQ8ua7lCDDtcMrWaZRwQuW84kj945V+qh9Nefps9PrMu6zsDB7YnoVnh5flp5JD+pdmjU/iSrTs3Q37o1EJ05kpA1vAp4jWR6NWGxA14HDBgmkbpbyr4ra8zmDch3sioUMh+ecIaW+eRPDsutbGpPM+8tMA7vbTjfZsbgf7Ltjv3TknWdApv1HIfWheSlurHOQ0PTcJ1WniGJEFAaTCdpG/6idY7lpgaJ45nAWB3C7KTuurLnPJdBg2M7OS9ByYbwz6wIXeM1PewUSrUNopkDfvyYgp8lZiC52xvnpmzZHvZbHTEIkYjAdXlrEPL41nHsKTYfENwldBDATw76mFPgAi8uuVZsv4YBpdJqq3n2ejy+srRHRh8/JSFNnXDvyOzAYu5j2bzfvc5yUhcJmvtQMY+cXzodY0nPc6MvK5YlVJfplW1Y57SWYuO0FjJrOwM15nmWw4xUrfweBohyz/yNXpA9IyOQSwHg5tC8hpK+HH+emWGmAocCeHk+vhvCGeSeqkBlHuLjbPXf5w0lOX5Rbj9iPrXPm8kcCMR2fqKAP0y5j/8nPnyo0dhUiwOvagpy5XR696ELLgiiDLzbf9sJc80dWr3wrvREfwcKFVfoSmBmngDZ8K1/zGX7NfRO+gYmhNaBgj+AyuHGwUxX4Ro1kbs0="
		);

//		Darkzone
		new MinecraftSkin("debrided",
				"ewogICJ0aW1lc3RhbXAiIDogMTY3MzIxODEwNTkyMCwKICAicHJvZmlsZUlkIiA6ICJjZjFiZDI4ZWUyNjM0YmQ0YWIxNDgxZmM2OGQ1NjQ5NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJkZWJyaWRlZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xMzgyOTRmOWVmYzU1MTMwMDg4MzRkNjQ0NjRiNzk1OTY4ODU5YWUxNjhiNDdlMmJhZWNkZWRlMDBhNDE5MmMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==",
				"JX9aUc40UpgC7G3uP8D6plpZnS9e/VZCfY0eB+rNaRTWLDqhrk+gFEGJy5bHvoszWuiJPVHa1o3z7fcgz13ChJh+8pOmBVHv/ji2yUYHBreW4lM02hEBlmFsVyiDmoGsf8g4jj0uuKpAQhxQbeqAJwQnZLWNVXFwHQ6gnqBvMn3PTLqtV+Zg4bjayS6jcnFgvgvhhk4mzlMWWJKlmAFvXm9FBe1CVIMFYEWRycih8kpGXzHNjBpuQ2SQnbtMSvQzs1RilDqD6/4wnVuQhgop0t6kq1mUN6AVLLj4YazK1fX6ylYRzamVMnsU1mrTXWKTp/0T88WAbhI+OQ6/PAikqigtROANrM18f8cF2CLlb2xtcG4aRKEtXGSDSgAU1llT16k0wqjJB8AsOxFWL+vqbVqgBMFaxM02InJpdoKwQ+fobeVy4cZeHgBwIcbeH9LqgGAveKfW4C6IuipRJM3WNwVHv0n4mu6nXV/11EgJEoA5v64W033/P+/N45NNEcz8WGC1Yu3Mgb47VCY6j+Zmwb8CbhJYLb8LxWH1jlt0UQpGeppwTbNEQDYIZqtf9KSUmeV025Y54+03CLntuu4cXR0Y7xrViR1VdbS5gV1HN7EfC6uZINEYgtgcVlwdjre1F5OkyxdgA21e3V7oMCz3d7I1hxoUBrcl+dkCc1WizjQ="
		);
		new MinecraftSkin("Merchant",
				"ewogICJ0aW1lc3RhbXAiIDogMTY3MzIxODEwNjU2NCwKICAicHJvZmlsZUlkIiA6ICJhMzllZjU3YTM4N2M0Y2QxOTc0MDU5YjczMmViYzdhNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNZXJjaGFudCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84NjRkNDMxNjUxZDhjZTdkYTJkOGY4OGRkODIyZDk1NTdkN2JjZjliMGI1ZDBhOGVkMTNiOTg5ODgxZmFkYmVmIgogICAgfQogIH0KfQ==",
				"gJ5TpCfjwCkxvkd0wxelGNplAReFWQEOr+LBsuP2GPH4gr7GLldXk3DIUBwg76vyIKXQYxoNhaQOEKrzMnaaoJxt2yJe4YrCfjsaGPuQh20MKmnkqvadrP7depejTnIuiFT4e8IuelCHiGjzlZtC5lVlfX2E9ybAtLz6eoYSD9e69OI2CvUDika3n/Y4CpOLC+EEDfo5aEvQwYwHn5tEyyTiWxogAK+pWHItwYEnbNsunhJNe1zCuS42Agaq+l60ukXje2nreoN+/rypp7re/Ljq0oXutNGNJe+a7SY4jt8StmUfLLVssqWcVX+/0k22BWNF3wkwO76KdPPtAnhv/dd97yDzcRFN5tYD7NHNU6Y471g7Y1gQ4gAkgsWagCUM/UEKFzhFVBys/uyJhGBxR5ak7k7j4c0RmVPYR0j9skJbso3jMc4fK8UYqrcf1gSxupJ4hN7/4k9SdkSricZC7jD09zKP8lIfTbhxXylTgwcTuIZQMDI7uUWQW5UO3/+2mg9oNP87SdQVetq+ULWEkPyn0XU+YTrCsIkO19VCEu4gm7W0MN6TUwoEJ1WKu8Ju/3jMIvVh3K0/g+oasY5p4YkR+iJOeCBGoY34mbeP7w1pk/ltJwpzL/UiUGCvSewpY6lTt2PmjMKIuuX7XGgLCxnoXPu9ZE1Snu/MKD3V1As="
		);
		new MinecraftSkin("Wiizard",
				"ewogICJ0aW1lc3RhbXAiIDogMTY3MzIxODEwNjE1MSwKICAicHJvZmlsZUlkIiA6ICJiZjU2OTVmNmU1NDg0M2U4YTNhM2NmMDc1ZmZiNmYwMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJXaWl6YXJkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJmNjlhYjJmNGU3MzQxYWMyNjI1OTcwODNjYTM4YWQwMWJmYmJmODczMGZiZmJkZDEwY2E5MGFlZTMzN2EyZGQiCiAgICB9CiAgfQp9",
				"VV5XDC9j7B/qqRMvjAZ6ODaFnyQe1DZudLSJDTSfgqpFZSvVh3bxLqWn1kvEb8XinLh0WdT4ajyoIgZgzqgyry4VVanIuPpPjiUnezV5IxTr3q2mxFof3kRbT8tXGpIEsHPe5fNoTmXpQROiWpHKEKk64xc/xDZvJSKVul2HCAEe25JEDO6xoz4L0OVr05ko/kiVaayU4lbg+ThNGqTi4gfprNWnM+J01hCZnJwkxxOsshRJ8RHBRg/k4FjUFHc0/2UvMTSy4gZ/b9yUb4fr3qKjzrKIkIjLFD7NvQR0Sb4IDgAusw7ssh5JWYn0gAENVLSZ6CA7akqKpebj+WJRBSrhaGFMHi4dP0zYCAfdn8MVIIH8CyCYHjXwAeegGSE77mGZ4y+L/Awuevx4dgebVaRxQ6a6CrHk661D69jNH6VFmXJvggzk5Z0zval88egbaGZdHFQzL7o8ydl8GXaBFcBvKk7KIpoHJQN831StlfqKtuyCkoLiToAMEwmefMZ/5NASRJX7YBBo/padgjKJtFsb3LX1GN7+lEM1xJjpuOvW6L0ZzNDW74gOg/cEs/qBWcZcBAajlHsd44I5lqBIpqRqokH/R8G51m6oxfsFss6l2jwn1i3lR2RO9ZypS9FwfGXYTrVeKwDARm0NwSpY8RnsAlkYiIaf6dpibffDdrw="
		);
		new MinecraftSkin("Itz_Aethan",
				"ewogICJ0aW1lc3RhbXAiIDogMTY3MzIxODEwNjQyOSwKICAicHJvZmlsZUlkIiA6ICJlMGM1ZGJjYmExYzA0MTFjYmVkYWNlODUxMDdjNmQ2YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJJdHpfQWV0aGFuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IzNWFmOGI5Yzc3NDYzOGYzODgyNGUyMTc2NmIxZmYxZTA2MTFkOGNiOWUyOTgzMTRmOWE2YTE4M2UwNzEyNjAiCiAgICB9CiAgfQp9",
				"hvVmF3J+DnIqhpSASStSdJ6gFIRdBXhrLJBITfpB6vxLh6NFloqDiIJAUB29kkwm/oD3fCkBIiosn9LNFZrmimDeWWkqpOXP28nDOPn04m8/GSzZitW2LP4Hp9qTaeV7zEEQ0kJKtrh0IQq9GWdlBc98D2J6z4CJmnXyJz6tH5ShTyW8deJQIIUcmulZlvK4RgDnBQD3nHLbQUT9z10A4noqEZXlN4Lqx7YPMpSw9iW26hbz2Heum5YXq13pk/UGkBs1Ppm9xhdTyCw8zLGwAo0FQe6bI0zDPHzAlD3qqC5TIszNPLAuO72cO9JgNX5IA+iHbuZJ5KqdDblNpGU9cbgJBqIl2n+FdmxLsm0xEJmaZ2nTMOsnKypGaU6lOQj2SH6QTUEixTElctskHfv45GFFz0dvQnVQ9PfhkVjMcKVHpv/g35PURXZfBwIqdqYke0mEwqjaLOJZ9Ly+M8XKTwthPTIl9ndn/C8yYicTW+Z/b8RQokRABfze82zBTPfw4t24UvnwpolkKIsntD30vQA6IuB72F4vvLY0cuocLKnorVSncFjpCI/rsRzir6D1JPknW89aRrGa57ABQHwjCILpBK2n1bG8gD71ybbxzNBoHTI6SOj/NVh5s19frVarNQyKWPgCtusVjiohbZGFdDeCtKyHpVpdNPz9xrEByAI="
		);
		new MinecraftSkin("Mailman",
				"ewogICJ0aW1lc3RhbXAiIDogMTY3OTY0NzY1MTYzMywKICAicHJvZmlsZUlkIiA6ICIzOTRiNWViZTM4YWE0NTE0Yjc1MGUzYzlmMTQyYzkxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYWlsbWFuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JkMGJlYWExY2JmZTM1OGI5ODU0NmFjOGVmZWE4N2IyNDVhNTYyNGFmOTdiMmZiMWJmNzcwOTNjMmRmMmE1OTEiCiAgICB9CiAgfQp9",
				"rIGRyCJ8W0RS8xYSyhGSR6HTCMfRWxPLyu4E+CqEns8L+aRpdIYJhJvfzw5d7krpZRMeEAaKI/MxRVb/tUZ0gtpbBBTrkx9yceODdrKzhrx2g9qfFxOD94Vla6AfYyxQeUmUQHu1LFsL7WUlAHSABvf1/d8GUUv2vBuXkwK9g3D2oWvSro7XVY9vCJiKEZsFfnLQebv7LRIRkTmst+CluKJnEWrL/NRsiHEfkoZhc3yWfIShQGzNeJ2b5QtlsQpaSajKfnSKNYSY8iQRGpk7oc1s7OheBG/6pxIckUlQhW+KThvHInK3m1QUlwKqCAnvOuZXSySCrTzlRyOfM8Qxv3Ddh73j+290wuHriUugp6Jmg8bN8J1y5pchbh9EjJTcH6dziD8HTYX77W+BCc4OHXIvNgEaMdAgodkOYC+NF+Tgo7baWiweeHrjjE3/eT8CTKfrLI7IkhHiCK8DrELDUCOxpiWaUV0QHt52kRa72pVe7LGGDEC7IBB1RBoJvj4D9XZRS9puE7PTpOniQ2GhLN+3fpJetuxZPg/amCmOhF3F+ToZf0tVCbq7aDts88YOBl1WlkR+VETaQJq7CdL2Gl9vg8nFbDbTFIUKxVBwmx/9KD63k7Y8BbZbChVVN0HgdxzTVJxKtnOhA+EOXqp1lShn2+Z9eCiF1+UA+xspdhw="
		);
	}

	public final String skinName;
	public final String skin;
	public final String signature;

	MinecraftSkin(String skinName, String skin, String signature) {
		this.skinName = skinName;
		this.skin = skin;
		this.signature = signature;

		minecraftSkins.add(this);
	}

	public static MinecraftSkin getSkin(String skinName) {
		for(MinecraftSkin skin : minecraftSkins) if(skin.skinName.equalsIgnoreCase(skinName)) return skin;
		return null;
	}
}
